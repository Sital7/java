import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressFetcher {
    public static void main(String[] args) {
        try {
            // Get the InetAddress object for www.oreilly.com
            InetAddress address = InetAddress.getByName("www.oreilly.com");
            
            // Print the IP address
            System.out.println("IP address of www.oreilly.com: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Could not resolve www.oreilly.com");
            e.printStackTrace();
        }
    }
}
