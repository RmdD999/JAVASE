package NetworkProgramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

//还是要等待客户端的链接！
public class UDPServer {
    public static void main(String[] args) throws IOException {
        //开放端口
        DatagramSocket datagramSocket = new DatagramSocket(9090);
        //receive data
        byte[] buffer = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buffer, 0,buffer.length);

        datagramSocket.receive(datagramPacket); //阻塞接收

        System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));

        datagramSocket.close();
    }
}
