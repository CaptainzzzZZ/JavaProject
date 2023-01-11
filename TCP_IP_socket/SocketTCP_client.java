package TCP_IP_socket;

import java.io.IOException;
import java.io.OutputStream;
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

        //2.连接上后通过socket.getOutputStream获取和socket关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();

        //3.通过输出流把数据写入数据通道
        outputStream.write("hello server".getBytes());
        //4.关闭socket和流
        outputStream.close();
        socket.close();
        System.out.println("程序结束");


    }
}
