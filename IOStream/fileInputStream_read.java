package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileInputStream_read {
    public static void main(String[] args) throws IOException {
        read();
    }

    static void read() throws IOException {
        byte[] bytes = new byte[8];
        String filePath="e:\\news.txt";
        int readLen=0;
        FileInputStream fileInputStream = new FileInputStream(filePath);
        while((readLen=fileInputStream.read(bytes))!=-1){
            System.out.print(new String(bytes,0,readLen));
        }
        fileInputStream.close();
    }
}
