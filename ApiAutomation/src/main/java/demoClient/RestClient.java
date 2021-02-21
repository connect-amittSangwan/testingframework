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

    // GET Method
    public CloseableHttpResponse get(String url) throws IOException {

        //HttpClients Class is added through libraries
        //ClosableHttpClient is abstract class
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse closeableHttpResponse = httpClient.execute(httpGet);//Hit the API

        return closeableHttpResponse;
    }
}
