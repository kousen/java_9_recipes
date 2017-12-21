package http;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;

public class JokeClient {
    public static void main(String[] args) throws Exception {
        URI uri = new URI("http://api.icndb.com/jokes/random?limitTo=[nerdy]");
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(
                HttpRequest
                        .newBuilder(uri)
                        .GET()
                        .build(),
                HttpResponse.BodyHandler.asString());
        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
