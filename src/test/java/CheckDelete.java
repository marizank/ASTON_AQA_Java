import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class CheckDelete {
     public static void main(String[] args) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpDelete httpDelete = new HttpDelete("https://postman-echo.com/delete");
        CloseableHttpResponse response;
        {
            try {
                response = httpClient.execute(httpDelete);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
