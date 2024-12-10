
    import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPAddress {
    public static void main(String[] args) {
        try {
            // Retrieve the InetAddress object for www.oreilly.com
            InetAddress address = InetAddress.getByName("www.oreilly.com");

            // Print the IP address
            System.out.println("IP Address of www.oreilly.com: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Could not find the IP address of www.oreilly.com");
            e.printStackTrace();
        }
    }
}
