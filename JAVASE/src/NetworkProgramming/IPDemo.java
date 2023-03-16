package NetworkProgramming;

import java.net.InetAddress;
import java.net.UnknownHostException;

//ip
public class IPDemo {
    public static void main(String[] args) throws UnknownHostException {
        //localhost
        InetAddress byName = InetAddress.getByName("127.0.0.1");
        System.out.println(byName);
        InetAddress localhost = InetAddress.getByName("localhost");
        System.out.println(localhost);
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        InetAddress byName1 = InetAddress.getByName("www.baidu.com");
        System.out.println(byName1);

        System.out.println(byName1.getAddress());
        System.out.println(byName1.getHostName());
        System.out.println(byName1.getCanonicalHostName());


    }
}
