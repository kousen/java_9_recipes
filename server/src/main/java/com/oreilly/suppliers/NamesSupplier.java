package com.oreilly.suppliers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class NamesSupplier implements Supplier<Stream<String>> {
    private Logger logger = Logger.getLogger(this.getClass().getName());

    private List<String> strings = Arrays.asList("Londo", "Vir", "G'Kar", "Na'Toth",
                                                 "Delenn", "Lennier", "Kosh");

    public List<String> getStrings() {
        return strings;
    }

    @Override
    public Stream<String> get() {
        return strings.stream();
    }
}
