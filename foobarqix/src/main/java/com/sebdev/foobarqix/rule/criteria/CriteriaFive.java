package com.sebdev.foobarqix.rule.criteria;

/**
 * Implementation of criteria rule specific to divisor 5
 */
public class CriteriaFive extends AbstractCriteria {

    @Override
    public boolean isDivisible(String value) {
        int[] parsedVeryBigInteger = parseStringToIntArray(value, 1);
        int lastDigit = parsedVeryBigInteger[parsedVeryBigInteger.length - 1];
        return (lastDigit == 0 || lastDigit == 5);
    }
}
