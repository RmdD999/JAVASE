package NetworkProgramming.day2;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        //create socket
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 9000);
        //output
        OutputStream os = socket.getOutputStream();
        //file stream
        FileInputStream fis = new FileInputStream(
                new File("/Users/raymonddu/Documents/GitHub/JAVASE/JAVASE/src/NetworkProgramming/day2/简历_杜星锐.docx"));
        //write
        byte[] buffer = new byte[1024];
        int len;
        while((len=fis.read(buffer))!=-1){
            os.write(buffer,0,len);
        }
        //notice server Already done
        socket.shutdownOutput();

        //confirm server received completed then disconnect
        InputStream inputStream = socket.getInputStream();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer2 = new byte[2014];
        int len2;
        while((len2 = inputStream.read(buffer2))!=-1){
            baos.write(buffer2,0,len2);
        }

        System.out.println(baos.toString());

        baos.close();
        inputStream.close();
        fis.close();
        os.close();
        socket.close();

    }
}
