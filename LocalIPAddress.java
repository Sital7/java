import java.net.InetAddress;
import java.net.UnknownHostException;

public class LocalIPAddress {
    public static void main(String[] args) {
        try {
            // Get the InetAddress object for the local machine
            InetAddress localAddress = InetAddress.getLocalHost();

            // Print the IP address
            System.out.println("Local IP Address: " + localAddress.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("Could not determine the local IP address.");
            e.printStackTrace();
        }
    }
}
