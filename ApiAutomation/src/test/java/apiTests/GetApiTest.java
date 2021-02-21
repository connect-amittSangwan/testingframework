package apiTests;

import base.TestBase;
import demoClient.RestClient;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetApiTest extends TestBase {

    TestBase testBase;
    String baseUrl;
    String apiUrl;
    String url;

    @BeforeMethod
    public void setUp() {
        testBase = new TestBase();
    }

    @Test
    public void getApiTest() throws IOException {
        url = properties.getProperty("baseUrl") + properties.getProperty("apiUrl");

        RestClient restClient = new RestClient();
        restClient.get(url);
    }

}
