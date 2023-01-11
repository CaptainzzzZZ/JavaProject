package TCP_IP_socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketTCP_client {
    public static void main(String[] args) throws IOException {
        //思路
        //1.连接服务器（ip，端口）
        // 连接本机9999端口，如果连接成功返回一个socket
        Socket socket = new Socket(InetAddress.getLocalHost().getHostAddress(), 9999);
        System.out.println("客户端socket"+socket.getClass());


//        //2.连接上后通过socket.getOutputStream获取和socket关联的输出流对象
//        OutputStream outputStream = socket.getOutputStream();//字节流
//        //3.通过输出流把数据写入数据通道
//        outputStream.write("hello server".getBytes());
//        //这里传输结束给一个结束标记 让服务端确定你传输结束
//        socket.shutdownOutput();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("hello server字符流");
        bufferedWriter.newLine(); //newLIne换行相当于一个结束标记
        bufferedWriter.flush();

        //接收服务端的回复
//        InputStream inputStream = socket.getInputStream();
//        int readLen=0;
//        byte[] bytes = new byte[1024];
//        while((readLen=inputStream.read(bytes))!=-1){
//            System.out.println(new String(bytes,0,readLen));
//        }
        //用转换流把字节流转换成字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        System.out.println(bufferedReader.readLine());
        bufferedWriter.flush();

        //4.关闭socket和流
//        outputStream.close();
        socket.close();
//        inputStream.close();
        System.out.println("程序结束");
    }
}
