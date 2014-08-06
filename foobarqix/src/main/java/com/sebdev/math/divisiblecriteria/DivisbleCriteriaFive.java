package com.sebdev.math.divisiblecriteria;

/**
 * Implementation of criteria rule specific to divisor 5
 */
public class DivisbleCriteriaFive extends AbstractDivisibleCriteria {

    @Override
    public boolean isDivisible(String value) {
        int[] parsedVeryBigInteger = parseStringToIntArray(value, 1);
        int lastDigit = parsedVeryBigInteger[parsedVeryBigInteger.length - 1];
        return (lastDigit == 0 || lastDigit == 5);
    }

    @Override
    public int getDivisorValue() {
        return 5;
    }
}
