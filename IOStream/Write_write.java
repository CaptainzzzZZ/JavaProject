package IOStream;

import java.io.FileWriter;
import java.io.IOException;

public class Write_write {
    public static void main(String[] args)throws IOException {
        write();
    }
    static void write()throws IOException {
        String filePath="e:\\note.txt";
        char[] chars={'c','h','a','r','s'};
        FileWriter writer = new FileWriter(filePath);
        writer.write("lzzzz永远的神",0,5);
        writer.write("captain".toCharArray(),0,5);
        writer.write(chars);
        writer.close();
        System.out.println("程序结束");
    }
}
