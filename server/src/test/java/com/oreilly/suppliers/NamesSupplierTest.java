package com.oreilly.suppliers;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.*;

public class NamesSupplierTest {
    private NamesSupplier supplier = new NamesSupplier();

    @Test
    public void get() throws IOException {
        Path namesPath = Paths.get("src/main/resources/names.txt");
        List<String> strings = Files.readAllLines(namesPath);
        supplier.get()
                .forEach(line -> assertTrue(strings.contains(line)));
    }
}