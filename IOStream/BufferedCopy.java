package IOStream;

import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) throws Exception {
        String src="e:\\news.txt";
        String dest="e:\\news66.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(src));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dest));//覆盖模式
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(dest,true));//追加模式

        String line;
        while((line=bufferedReader.readLine())!=null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
