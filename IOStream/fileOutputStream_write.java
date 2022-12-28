package IOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class fileOutputStream_write {
    public static void main(String[] args) throws IOException {
        write();
    }
    static void write()throws IOException {
        String filePath="e:\\new9.txt";
        FileOutputStream fileOutputStream =
                new FileOutputStream(filePath);//此构造方法是覆盖的
        FileOutputStream fileOutputStream1 =
                new FileOutputStream("e:\\news2.txt", true);
        //此构造方法是append的
        String str="hahahahahagagaga";
        fileOutputStream1.write(str.getBytes());
        fileOutputStream.close();
    }
}
