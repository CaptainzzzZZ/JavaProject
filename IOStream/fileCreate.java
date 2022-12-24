package IOStream;

import java.io.File;
import java.io.IOException;

public class fileCreate {
    public static void main(String[] args) {
        String filePath="e:\\news.txt";//第一种方法
        String fileParent="e:\\";//第二种方法
        String filename="news2.txt";
        File file = new File(filePath);

        try {
            boolean newFile = file.createNewFile();
            System.out.println("创建成功1");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File file1 = new File(fileParent, filename);

        try {
            boolean newFile2 = file1.createNewFile();
            System.out.println("创建成功2");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
