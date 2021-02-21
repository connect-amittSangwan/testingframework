package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public Properties properties = new Properties();

    //Not hardcoding status code in @Tests
    public int RESPONSE_STATUS_CODE_200 =200;
    public int RESPONSE_STATUS_CODE_500 =500;
    public int RESPONSE_STATUS_CODE_400 =400;
    public int RESPONSE_STATUS_CODE_401 =401;

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
