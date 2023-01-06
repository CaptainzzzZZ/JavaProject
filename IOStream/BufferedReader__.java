package IOStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

public class BufferedReader__ {
    public static void main(String[] args) throws Exception{
        //处理流BufferedReader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(bufferedReader.readLine());
        String filepath="e:\\news.txt";
        FileReader fileReader = new FileReader(filepath);
        BufferedReader reader = new BufferedReader(fileReader);
        //处理流（包装流）类内部封装了一个顶级父类Reader
        String line;

        while((line=reader.readLine())!=null);
            System.out.println(line);
        reader.close();
        /*
        public void close() throws IOException {
        synchronized (lock) {
            if (in == null)
                return;
            try {
                in.close();
            } finally {
                in = null;
                cb = null;
            }
        }
    }
         */
    }
}
