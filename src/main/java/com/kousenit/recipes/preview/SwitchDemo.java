package com.kousenit.recipes.preview;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class SwitchDemo {
    @SuppressWarnings("EnhancedSwitchMigration")
    public static int numLettersClassic(Month month) {
        int total = 0;
        switch (month.getDisplayName(TextStyle.FULL, Locale.US)) {
            case "May":
                total = 3;
                break;
            case "June":
            case "July":
                total = 4;
                break;
            case "March":
            case "April":
                total = 5;
                break;
            case "August":
                total = 6;
                break;
            case "January":
            case "October":
                total = 7;
                break;
            case "February":
            case "November":
            case "December":
                total = 8;
                break;
            case "September":
                total = 9;
                break;
            default:
                throw new IllegalArgumentException(
                        "Houston, we have a problem: ");
        }
        return total;
    }

    public static int numLettersEnhanced(Month month) {
        return switch (month.getDisplayName(TextStyle.FULL, Locale.US)) {
            case "May" -> 3;
            case "June", "July" -> 4;
            case "March", "April" -> 5;
            case "August" -> 6;
            case "January", "October" -> 7;
            case "February", "November", "December" -> 8;
            case "September" -> 9;
            default -> throw new IllegalArgumentException(
                    "Houston, we have a problem: ");
        };
    }
}
