package IOStream;

import java.io.*;

public class ObjectIOStream {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        xuliehua();//序列化 序列化就是把一个对象保存到一个文件或数据库字段中去
        faxulie();//反序列化就是在适当的时候把这个文件再转化成原来的对象使用。
    }
    static void xuliehua() throws IOException {
        String filePath="e:\\data.txt";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));//out write是写出去到文件
        objectOutputStream.writeChar('a');
        objectOutputStream.writeDouble(9.5);
        objectOutputStream.writeObject(new dogForSerializable("lzz",22));
        objectOutputStream.close();
        System.out.println("序列化结束");
    }
    static void faxulie() throws IOException, ClassNotFoundException {
        String filePath="e:\\data.txt";
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath));
        System.out.println(objectInputStream.readChar());
        System.out.println(objectInputStream.readDouble());
        Object readObject = objectInputStream.readObject();
        System.out.println(readObject);
        objectInputStream.close();
    }
}
