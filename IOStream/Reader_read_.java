package IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader_read_ {
    public static void main(String[] args) throws IOException {
//        read01();
        read02();
    }
    private static void read01() throws IOException{
        String filepath="e:\\news.txt";
        FileReader reader = new FileReader(filepath);
        int data='0';
        while((data=reader.read())!=-1){
            System.out.print((char)data);
        }
        reader.close();
    }

    private static void read02() throws IOException {
        String filepath="e:\\news.txt";
        FileReader reader = new FileReader(filepath);
        char[] chars = new char[8];
        int len=0;
        while((len=reader.read(chars))!=-1){
            System.out.print(new String(chars,0,len));
        }
        reader.close();
    }
}
