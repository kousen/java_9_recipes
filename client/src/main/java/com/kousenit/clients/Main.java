package com.kousenit.clients;

import com.oreilly.suppliers.NamesSupplier;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        NamesSupplier supplier = new NamesSupplier();

        try (Stream<String> lines = supplier.get()) {
            lines.forEach(line -> System.out.printf("Hello, %s!%n", line));
        }
        try (Stream<String> lines = supplier.get()) {
            lines.forEach(line -> System.out.printf("What up, %s?%n", line));
        }
    }
}
