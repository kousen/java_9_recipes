package http;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.ExecutionException;

public class JokeClient {
    private String jokeUrl = "http://api.icndb.com/jokes/random?limitTo=[nerdy]";
    private HttpClient client;
    private HttpRequest request;

    public JokeClient() {
        client = HttpClient.newBuilder()
                           .version(HttpClient.Version.HTTP_2)
                           .connectTimeout(Duration.ofSeconds(2))
                           .build();
        request = HttpRequest.newBuilder()
                             .uri(URI.create(jokeUrl))
                             .GET()
                             .build();
    }

    public String getJokeSync() throws IOException, InterruptedException {
        HttpResponse<String> response = client.send(
                request,
                HttpResponse.BodyHandlers.ofString());
        return response.body();
    }

    public String getJokeAsync() throws ExecutionException, InterruptedException {
        HttpClient client = HttpClient.newBuilder()
                                      .version(HttpClient.Version.HTTP_2)
                                      .connectTimeout(Duration.ofSeconds(2))
                                      .build();

        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                     .thenApply(HttpResponse::body)
                     .get();
    }
}
