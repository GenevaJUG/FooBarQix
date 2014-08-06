package com.sebdev.math;

public class MathUtils {

    /**
     * Return true if numerator is divible by divisor
     * @return 
     */
    public static boolean isDivisibleBy(int numerator, int divisor) {
        return (numerator % divisor) == 0;
    }
}
