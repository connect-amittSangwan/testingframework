package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public Properties properties = new Properties();

    //Base Class Constructor
    public BaseTest() {

        {
            try {
                FileInputStream fInput = new FileInputStream("src/main/java/config/config.properties");
                properties.load(fInput);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}