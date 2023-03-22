package NetworkProgramming;

import java.io.IOException;
import java.net.*;

public class UDPClient{
    public static void main(String[] args) throws IOException {
        //create a socket
        DatagramSocket datagramSocket = new DatagramSocket();

        //create a pakage
        String msg = "Hello world!";
        InetAddress localhost = InetAddress.getByName("localhost");
        int port = 9090;
        DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(),0,msg.getBytes().length,localhost,port);

        //send pakage

        datagramSocket.send(datagramPacket);

        //close
        datagramSocket.close();

    }
}
