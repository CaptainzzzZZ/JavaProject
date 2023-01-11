package TCP_IP_socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddress_ {
    private int id;

    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//DESKTOP-V71B6IF/192.168.0.102
        System.out.println(InetAddress.getByName("DESKTOP-V71B6IF"));//DESKTOP-V71B6IF/192.168.0.102///主机名域名获取ip
        System.out.println(localHost.getHostName());//获取InetAddress对象主机名DESKTOP-V71B6IF
        System.out.println(localHost.getHostAddress());//获取InetAddress对象地址192.168.0.102
    }
}
