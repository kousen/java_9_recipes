package http;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.*;

class JokeClientTest {
    private JokeClient client = new JokeClient();

    @Test
    void getJokeSync() throws IOException, InterruptedException {
        String joke = client.getJokeSync("Pratik", "Patel");
        System.out.println(joke);
        assertTrue(joke.contains("Pratik") || joke.contains("Patel"));
    }

    @Test
    void getJokeAsync() throws ExecutionException, InterruptedException {
        String joke = client.getJokeAsync("Pratik", "Patel");
        System.out.println(joke);
        assertTrue(joke.contains("Pratik") || joke.contains("Patel"));
    }
}