package com.sebdev.foobarqix.rule.criteria;

import com.sebdev.foobarqix.math.MathUtils;

public class CriteriaThree extends AbstractCriteria {

    @Override
    public boolean isDivisible(String value) {
        int[] intTab = parseStringToIntArray(value);
        int total = 0;
        for (int digit : intTab) {
            total += digit;
        }
        return MathUtils.isDivisibleBy(total, 3);
    }
}
