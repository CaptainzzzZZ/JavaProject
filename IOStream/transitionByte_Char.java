package IOStream;

import java.io.*;

public class transitionByte_Char {
    public static void main(String[] args) throws Exception {
        InputStreamReader_();
        OutputStreamWriter_();

    }
    static void InputStreamReader_() throws IOException {
        String filePath="e:\\news.txt";
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath),"gbk"));
        System.out.println(bufferedReader.readLine());
        bufferedReader.close();
    }
    static void OutputStreamWriter_() throws IOException{
        String charSet="utf-8";
        String filePath="e:\\OutputStreamWriter.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath, charSet.isEmpty())));
        bufferedWriter.write("字节输出流转换成字符输出流");
        bufferedWriter.close();
    }
}
