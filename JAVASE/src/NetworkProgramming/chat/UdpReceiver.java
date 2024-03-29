package NetworkProgramming.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(6666);

        while(true){

            //准备接收包裹
            byte[] container = new byte[1024];

            DatagramPacket packet = new DatagramPacket(container,0,container.length);

            //断开链接
            byte[] data = packet.getData();
            String receiveData = new String(data, 0, data.length);

            System.out.println(receiveData);

            if(receiveData.equals("bye")){
                break;
            }

            socket.receive(packet);//阻塞接收包裹
        }

        socket.close();

    }
}
