package IOStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedIOCopy {
    public static void main(String[] args)throws Exception {
        //Buffered IOputStream 字节流拷贝主要是音频视频图片
        String src="e:\\tangmu.jpg";
        String dest = "e:\\jierui.jpg";
        byte[] bytes = new byte[1024];
        int readlen=0;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(dest,true));
        while((readlen=bufferedInputStream.read(bytes))!=-1){
            bufferedOutputStream.write(bytes,0,readlen);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
        System.out.println("拷贝结束");
    }
}
