package com.sebdev.foobarqix.rule.criteria;

/**
 *
 */
public class CriteriaFive extends AbstractCriteria {

    @Override
    public boolean isDivisible(String value) {
        int[] intTab = parseStringToIntArray(value);
        int lastDigit = intTab[intTab.length - 1];
        return (lastDigit == 0 || lastDigit == 5);
    }
}
