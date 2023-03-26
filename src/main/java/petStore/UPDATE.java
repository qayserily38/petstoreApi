package petStore;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;

import org.apache.http.client.methods.HttpPut;

import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class UPDATE {

    public static void main(String[] args) throws IOException {

        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {

            HttpPut httpPut = new HttpPut("https://jsonplaceholder.typicode.com/posts/1");

            // specify the PUT body to send to the server as part of the request
            httpPut.setEntity(new StringEntity("{\"id\":1,\"name\":\"pofidik\"}"));

            System.out.println("Executing PUT request...");
            HttpResponse response = httpclient.execute(httpPut);

            System.out.println("Status code:" + response.getStatusLine().getStatusCode());

            String responseBody = new BasicResponseHandler().handleResponse(response);

            System.out.println(responseBody);


        }
    }
}