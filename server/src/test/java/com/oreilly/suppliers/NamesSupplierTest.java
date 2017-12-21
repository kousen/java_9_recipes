package com.oreilly.suppliers;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class NamesSupplierTest {
    private NamesSupplier supplier = new NamesSupplier();

    @Test
    public void get() {
        supplier.get()
                .forEach(line -> assertTrue(supplier.getStrings().contains(line)));
    }
}