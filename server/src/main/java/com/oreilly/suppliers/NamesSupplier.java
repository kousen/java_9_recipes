package com.oreilly.suppliers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.function.Supplier;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class NamesSupplier implements Supplier<Stream<String>> {
    private Path namesPath = Paths.get("src/main/resources/names.txt");
    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Override
    public Stream<String> get() {
        logger.info("Request for names on " + Instant.now());
        try {
            return Files.lines(namesPath);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
