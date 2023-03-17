package NetworkProgramming.day2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExe01 {
    public static void main(String[] args) throws IOException {
        InetAddress server = InetAddress.getByName("127.0.0.1");
        //port
        int port = 9909;

        Socket socket = new Socket(server,port);

        //sending data
        OutputStream os = socket.getOutputStream();
        os.write("Hello there".getBytes());

        socket.close();

    }
}
