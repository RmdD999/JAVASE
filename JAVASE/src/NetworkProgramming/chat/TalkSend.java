package NetworkProgramming.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class TalkSend implements Runnable{
    DatagramSocket socket = null;
    BufferedReader reader = null;

    private int fromPort;
    private String toIp;
    private int toPort;

    public TalkSend(int fromPort, String toIp, int toPort) throws SocketException {
        this.fromPort = fromPort;
        this.toIp = toIp;
        this.toPort = toPort;

        socket = new DatagramSocket(fromPort);
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void run() {
        while(true){
            try{
                String data = reader.readLine();
                byte[] datas = data.getBytes();
                DatagramPacket packet = new DatagramPacket(datas,0,datas.length,new InetSocketAddress(this.toIp,this.toPort));

                socket.send(packet);
                if(data.equals("bye")){
                    break;
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        socket.close();
    }
}
