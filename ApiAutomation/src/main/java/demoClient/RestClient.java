package demoClient;

import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class RestClient {

    //1. GET Method
    public void get(String url) throws IOException {

        //HttpClients Class is added through libraries
        //ClosableHttpClient is abstract class
        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpGet);//Hit the API

        int statusCode = closeableHttpResponse.getStatusLine().getStatusCode();

        String responseDataString = EntityUtils.toString(closeableHttpResponse.getEntity(), StandardCharsets.UTF_8);

        //From json library
        JSONObject jsonObject = new JSONObject(responseDataString);

        //All Headers
        Header[] headers = closeableHttpResponse.getAllHeaders();

        HashMap<String,String> allHeaders = new HashMap<>();

        for(Header header : headers ){
            allHeaders.put(header.getName(),header.getValue());
        }

        System.out.println("Status Code: " + statusCode);
        System.out.println("Response Json: " + jsonObject );
        System.out.println("Headers Array: " + allHeaders);
    }
}
