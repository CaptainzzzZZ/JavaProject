package IOStream;

import java.io.*;

public class fileCopy {
    public static void main(String[] args)throws IOException {
        copy();
    }
    static void copy() throws IOException {
        String src="E:\\tangmu.jpg";
        String dest="e:\\tangmu02.jpg";
        FileInputStream inputStream = new FileInputStream(src);
        FileOutputStream outputStream = new FileOutputStream(dest);
        byte[] bytes = new byte[1024];
        int readlen=0;
        while((readlen=inputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,readlen);
        }
        outputStream.close();
        inputStream.close();
    }
}
