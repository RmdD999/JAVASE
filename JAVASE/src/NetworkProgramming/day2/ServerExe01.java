package NetworkProgramming.day2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExe01 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9909);

        Socket socket = serverSocket.accept();

        InputStream is = socket.getInputStream();

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len;
        while((len=is.read(buffer))!=-1){
            baos.write(buffer,0,len);
        }

        System.out.println(baos.toString());

        baos.close();
        is.close();
        socket.close();
        serverSocket.close();


    }
}
