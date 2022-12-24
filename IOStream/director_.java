package IOStream;

import java.io.File;

public class director_ {
    public static void main(String[] args) {
        String filename="e:\\news2.txt";
        File file = new File(filename);

        if (file.exists()){
            if (file.delete()){
                System.out.println(filename+"删除成功");
            }
            else {
                System.out.println("删除失败");
            }
        }
        else {
            System.out.println(filename+"文件不存在");
        }


        String directorname="e:\\news\\news1";
        //目录当文件使用
        File file1 = new File(directorname);

        if (file1.exists()){
            System.out.println(directorname+"目录存在");
        }
        else {
            if(file1.mkdirs()){
                //mkdirs==makedirectors 创建目录s
                //mkdir 创建单级目录
                System.out.println(directorname+"目录创建成功");
            }
            else{
                System.out.println("创建失败");
            }
        }
    }
}
