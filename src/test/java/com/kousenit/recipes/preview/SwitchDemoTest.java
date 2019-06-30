package com.kousenit.recipes.preview;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwitchDemoTest {

    @ParameterizedTest(name = "Checking length of {0}")
    @EnumSource(Month.class)
    void numLettersClassic(Month month) {
        assertEquals(month.name().length(),
                SwitchDemo.numLettersClassic(month));
    }

    @ParameterizedTest(name = "Checking length of {0}")
    @EnumSource(Month.class)
    void numLettersEnhanced(Month month) {
        assertEquals(month.name().length(),
                SwitchDemo.numLettersEnhanced(month));
    }
}