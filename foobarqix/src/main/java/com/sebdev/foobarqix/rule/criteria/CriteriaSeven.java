package com.sebdev.foobarqix.rule.criteria;

import com.sebdev.foobarqix.math.MathUtils;

/**
 *
 */
public class CriteriaSeven extends AbstractCriteria {

    @Override
    public boolean isDivisible(String value) {
        int[] intTab = parseStringToIntArray(value);
        int secondDigit = intTab[intTab.length - 2];
        int firstDigit = intTab[intTab.length - 1];
        
        return MathUtils.isDivisibleBy(secondDigit - firstDigit * 2 , 7);   
    }
    
}
