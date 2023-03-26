package petStore;

import org.apache.http.HttpHeaders;
import org.apache.http.HttpResponse;

import org.apache.http.client.methods.HttpDelete;

import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class DELETE {

    public static void main(String[] args) throws IOException {

        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpDelete httpget = new HttpDelete("https://jsonplaceholder.typicode.com/posts/1");

            System.out.println("Executing DELETE request...");
            HttpResponse response = httpclient.execute(httpget);

            System.out.println("Status code: " + response.getStatusLine().getStatusCode());

            String responseBody = new BasicResponseHandler().handleResponse(response);

            System.out.println("Response: " + responseBody);
        }
    }
}