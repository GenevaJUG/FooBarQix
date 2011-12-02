package com.sebdev.foobarqix.rule.criteria;

import com.sebdev.foobarqix.math.MathUtils;

/**
 * Implementation of criteria rule specific the divisor 3
 */
public class CriteriaThree extends AbstractCriteria {

    @Override
    public boolean isDivisible(String value) {
        int[] intTab = parseStringToIntArray(value, 1);
        int total = 0;
        for (int digit : intTab) {
            total += digit;
        }
        return MathUtils.isDivisibleBy(total, 3);
    }
}
