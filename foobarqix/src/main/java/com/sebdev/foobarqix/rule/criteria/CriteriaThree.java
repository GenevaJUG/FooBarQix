package com.sebdev.foobarqix.rule.criteria;

import com.sebdev.foobarqix.math.MathUtils;

/**
 * Implementation of criteria rule specific to divisor 3
 */
public class CriteriaThree extends AbstractCriteria {

    @Override
    public boolean isDivisible(String value) {
        int[] parsedVeryBigInteger = parseStringToIntArray(value, 1);
        int total = 0;
        for (int digit : parsedVeryBigInteger) {
            total += digit;
        }
        return MathUtils.isDivisibleBy(total, 3);
    }
}
