package com.sebdev.math.divisiblecriteria;

import com.sebdev.math.MathUtils;

/**
 * Implementation of criteria rule specific to divisor 3
 */
public class DivisibleCriteriaThree extends AbstractDivisibleCriteria {

    @Override
    public boolean isDivisible(String value) {
        int[] parsedVeryBigInteger = parseStringToIntArray(value, 1);
        int total = 0;
        for (int digit : parsedVeryBigInteger) {
            total += digit;
        }
        return MathUtils.isDivisibleBy(total, 3);
    }

    @Override
    public int getDivisorValue() {
        return 3;
    }
}
