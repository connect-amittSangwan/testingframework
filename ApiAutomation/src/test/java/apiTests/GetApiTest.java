package apiTests;

import base.BaseTest;
import demoClient.RestClient;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class GetApiTest extends BaseTest {

    BaseTest baseTest;
    String baseUrl = properties.getProperty("baseUrl");
    String apiUrl = properties.getProperty("apiUrl");
    String url;
    CloseableHttpResponse closeableHttpResponse;

    //Initiallizing BaseTest Class Construction
    @BeforeMethod
    public void setUp() {
        baseTest = new BaseTest();
    }

    /*
    Using RestAssured
    REST Assured is a Java library that provides a domain-specific language (DSL)
    for writing powerful, maintainable tests for RESTful APIs.
    */
    @Test
    public void restAssuredWay() {
        Response response = RestAssured.given()
                .spec(new RequestSpecBuilder().setRelaxedHTTPSValidation().setBaseUri(baseUrl)
                .addHeader("Content-Type", "aapplication/json")
                .build())
                .get(apiUrl);

        System.out.println(response.getBody().asString());
    }

    //Using Apache HTTP Client
    @Test
    public void getApiTest() throws IOException {
        url = baseUrl + apiUrl;
        RestClient restClient = new RestClient();
        closeableHttpResponse = restClient.get(url);

        //Status Code
        int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();

        Assert.assertEquals(statusCode, RESPONSE_STATUS_CODE_200, "Status Code Assertion Failed");

        //Json Response
        String responseDataString = EntityUtils.toString(closeableHttpResponse.getEntity(), StandardCharsets.UTF_8);
        JSONObject jsonObject = new JSONObject(responseDataString);

        //All Headers
        Header[] headers = closeableHttpResponse.getAllHeaders();
        HashMap<String, String> allHeaders = new HashMap<>();

        for (Header header : headers) {
            allHeaders.put(header.getName(), header.getValue());
        }

    }

}