package NetworkProgramming.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpSender {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9999);

        //准备数据： 控制台读取 System.in
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String data = reader.readLine();
        byte[] bytes = data.getBytes();

        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length
        ,new InetSocketAddress("localhost",6666));

        datagramSocket.send(datagramPacket);

        datagramSocket.close();
    }
}
