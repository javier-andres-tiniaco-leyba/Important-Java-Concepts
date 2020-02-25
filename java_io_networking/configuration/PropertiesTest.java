import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws Exception {
        // Set up new properties file object from file myProperties.txt
        FileInputStream propFile = new FileInputStream("myProperties.properties");

        // Create a new Properties object with given properties as default
        Properties appProperties = new Properties(System.getProperties());

        // Load into the properties object the properties in the file
        appProperties.load(propFile);
        propFile.close();

        // Set the system properties. This is temporal, only for the program lifetime.
        System.setProperties(appProperties);

        // Display then new properties
        System.getProperties().list(System.out);

        // Add some value to properties
        appProperties.setProperty("lastModified",
            String.format("%d",System.currentTimeMillis()));

        // Save properties
        FileOutputStream out = new FileOutputStream("appConfig.properties");
        appProperties.store(out," ---No Comment---");
        System.exit(0);
    }
}
