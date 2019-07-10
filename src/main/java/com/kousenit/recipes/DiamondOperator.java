package com.kousenit.recipes;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class DiamondOperator {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();

        Consumer<String> consumer = new Consumer<>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello, " + s);
            }
        };

    }
}
