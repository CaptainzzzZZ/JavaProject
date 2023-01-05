package IOStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStream_Printwrite {
    public static void main(String[] args) throws IOException {
        printstream();
        printwrite();
    }
    static void printstream()  throws IOException{
        PrintStream out = System.out;
        out.println(666);
        out.write("lzz大傻逼".getBytes());
        out.close();
        System.setOut(new PrintStream("e:\\news.txt"));
        System.out.println("lzzadasahbi");
    }
    static void printwrite() throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter("e:\\news.txt"));
        printWriter.print("吕zhenzhen");
        printWriter.close();
    }
}
