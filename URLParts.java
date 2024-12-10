import java.net.MalformedURLException;
import java.net.URL;

public class URLParts {
    public static void main(String[] args) {
        // Example URL to parse
        String urlString = "https://www.oreilly.com:80/index.html";

        try {
            // Create a URL object
            URL url = new URL(urlString);

            // Extract and print the parts of the URL
            System.out.println("URL: " + url);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort() );
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Fragment: " + url.getRef());
            
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL format.");
            e.printStackTrace();
        }
    }
}