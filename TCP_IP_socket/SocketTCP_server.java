package TCP_IP_socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP_server {
    public static void main(String[] args) throws IOException {
        //思路
        //1.在本机的9999端口进行监听，等待连接..
        //注意：要求在本机没有其他服务监听9999端口
        //注意  一个ServerSocket一个服务器可以有多个主机连入只要ServerSocket服务器接受了就会返回一个socket，就是连上了
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("等待连接..");
        //2.当没有客户端连接9999端口时服务端会阻塞，等待连接..
        //  当有客户端连接时 ServerSocket会返回一个socket。
        Socket socket = serverSocket.accept();
        System.out.println("服务端socket"+socket.getClass());

//        //3.通过socket.getInputStream读入客户端写入数据通道的数据
//        InputStream inputStream = socket.getInputStream();
//
//        //4.IO读入
//        byte[] bytes = new byte[1024];
//        int readLen=0;
//        while((readLen=inputStream.read(bytes))!=-1){
//            System.out.println(new String(bytes,0,readLen));
//        }

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line=bufferedReader.readLine();
        System.out.println(line);

        //5.回复客户端一个"hello client"
//        OutputStream outputStream = socket.getOutputStream();
//        outputStream.write("hello client".getBytes());
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bufferedWriter.write("hello client字符流");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        //在服务端要给一个结束标记，不然客户端会认为你没有传输结束
        socket.shutdownOutput();

//        outputStream.close();
        serverSocket.close();
        socket.close();
//        inputStream.close();
        bufferedReader.close();
        System.out.println("程序结束");
    }
}
