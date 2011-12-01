package com.sebdev.foobarqix.math;

/**
 * Specific Methods for what we call a very big integer in this project
 */
public class VeryBigIntegerUtils {

    public static boolean isInteger(String value) {
        for (char car : value.toCharArray()) {
            if (!Character.isDigit(car)) {
                return false;
            }
        }
        return true;
    }
}
