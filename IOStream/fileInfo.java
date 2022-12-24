package IOStream;

import java.io.File;

public class fileInfo {

    public static void main(String[] args) {


        File file = new File("e:\\news.txt");
        File file1 = new File("e:\\");

        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file1.isDirectory());
        System.out.println(file.canWrite());
        System.out.println(file.canRead());

    }
}
