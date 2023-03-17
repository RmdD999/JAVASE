package NetworkProgramming.day2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientDemo01 {
    public static void main(String[] args) throws IOException {
        // get server address
        InetAddress server1 = InetAddress.getByName("127.0.0.1");

        int port = 9999;
        //create socket
        Socket socket = new Socket(server1,port);

        //send msg
        OutputStream os = socket.getOutputStream();
        os.write("Welcome".getBytes());

        socket.close();

    }
}
