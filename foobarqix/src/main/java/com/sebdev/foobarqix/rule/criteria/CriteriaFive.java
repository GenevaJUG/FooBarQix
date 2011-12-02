package com.sebdev.foobarqix.rule.criteria;

/**
 * Implementation of criteria rule specific the divisor 5
 */
public class CriteriaFive extends AbstractCriteria {

    @Override
    public boolean isDivisible(String value) {
        int[] intTab = parseStringToIntArray(value, 1);
        int lastDigit = intTab[intTab.length - 1];
        return (lastDigit == 0 || lastDigit == 5);
    }
}
