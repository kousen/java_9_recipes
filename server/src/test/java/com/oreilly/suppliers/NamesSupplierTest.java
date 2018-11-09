package com.oreilly.suppliers;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NamesSupplierTest {
    private NamesSupplier supplier = new NamesSupplier();

    @Test
    public void get() {
        supplier.get()
                .forEach(line -> assertTrue(supplier.getStrings().contains(line)));
    }
}