package apiTests;

import base.BaseTest;
import demoClient.RestClient;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class GetApiTest extends BaseTest {

    BaseTest baseTest;
    String baseUrl;
    String apiUrl;
    String url;

    //Initiallizing BaseTest Class Construction
    @BeforeMethod
    public void setUp() {
        baseTest = new BaseTest();
    }

    @Test
    public void getApiTest() throws IOException {
        url = properties.getProperty("baseUrl") + properties.getProperty("apiUrl");

        RestClient restClient = new RestClient();
        restClient.get(url);
    }

}