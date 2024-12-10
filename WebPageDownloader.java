import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class WebPageDownloader {

    public static void main(String[] args) {
        String webpageUrl = "http://www.example.com"; // Specify the URL of the webpage
        String outputFilePath = "downloaded_page.html"; // Output file to save webpage content

        try {
            // Open connection to the specified URL 
            URL url = new URL(webpageUrl);
            URLConnection connection = url.openConnection();

            // Read webpage content
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Close the resources
            reader.close();
            writer.close();

            System.out.println("Webpage downloaded successfully to " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Error downloading webpage: " + e.getMessage());
        }
    }
}
