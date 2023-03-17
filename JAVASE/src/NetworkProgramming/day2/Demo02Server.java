package NetworkProgramming.day2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo02Server {
    public static void main(String[] args) throws IOException {
        //create service
        ServerSocket serverSocket = new ServerSocket(9000);
        //monitoring
        Socket socket = serverSocket.accept();//阻塞监听 一直等待客户端

        //get input stream
        InputStream is = socket.getInputStream();
        //file output
        FileOutputStream fos = new FileOutputStream(new File("receive.docx"));
        byte[] buffer = new byte[1024];
        int len;
        while((len=is.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }

        //notice client
        OutputStream os = socket.getOutputStream();
        os.write("Completed, please disconnect".getBytes());

        fos.close();
        is.close();
        socket.close();
        serverSocket.close();

    }
}
