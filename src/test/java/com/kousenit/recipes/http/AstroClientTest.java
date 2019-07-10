package com.kousenit.recipes.http;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AstroClientTest {
    private AstroClient client = new AstroClient();

    @Test
    void checkJsonOutput() {
        System.out.println(client.getJsonResponse());
    }
}