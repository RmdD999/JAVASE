package NetworkProgramming;

public class InetSocketAddress {
    public static void main(String[] args) {
        java.net.InetSocketAddress inetSocketAddress = new java.net.InetSocketAddress("127.0.0.1", 8080);
        System.out.println(inetSocketAddress);

        System.out.println(inetSocketAddress.getAddress());
        System.out.println(inetSocketAddress.getHostName());
        System.out.println(inetSocketAddress.getPort());
    }
}
