package com.kousenit.clients;

import com.oreilly.suppliers.NamesSupplier;

import java.util.stream.Stream;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());

        NamesSupplier supplier = new NamesSupplier();

        try (Stream<String> lines = supplier.get()) {
            lines.forEach(line -> logger.info(String.format("Hello, %s!%n", line)));
        }
        try (Stream<String> lines = supplier.get()) {
            lines.forEach(line -> System.out.printf("What up, %s?%n", line));
        }
    }
}
