package com.sebdev.foobarqix.rule.criteria;

import com.sebdev.foobarqix.math.MathUtils;

/**
 * Implementation of criteria rule specific the divisor 7
 */
public class CriteriaSeven extends AbstractCriteria {

    @Override
    public boolean isDivisible(String value) {
        
        int[] intTab = parseStringToIntArray(value, 3);
        int valueToEvaluate = 0;
        for (int index = 0; index < intTab.length; index++) {
            if (index % 2 == 0) {
                valueToEvaluate += intTab[index];
            } else {
                valueToEvaluate -= intTab[index];
            }
        }

        return MathUtils.isDivisibleBy(valueToEvaluate, 7);   
    }
    
}
