import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPatch;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class CheckPatch {
    public static void main(String[] args) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPatch httpPatch = new HttpPatch("https://postman-echo.com/patch");
        StringEntity patchEntity = new StringEntity("{\"key\":\"value\"}", ContentType.APPLICATION_JSON);
        httpPatch.setEntity(patchEntity);
        CloseableHttpResponse response = httpClient.execute(httpPatch);
        try {
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                System.out.println(EntityUtils.toString(entity));
            }
        } finally {
            response.close();
        }
    }
}