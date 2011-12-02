package com.sebdev.foobarqix.rule.criteria;

import com.sebdev.foobarqix.math.MathUtils;

/**
 * Implementation of criteria rule specific to divisor 7
 */
public class CriteriaSeven extends AbstractCriteria {

    @Override
    public boolean isDivisible(String value) {
        
        int[] parsedVeryBigInteger = parseStringToIntArray(value, 3);
        int valueToEvaluate = 0;
        for (int index = 0; index < parsedVeryBigInteger.length; index++) {
            if (index % 2 == 0) {
                valueToEvaluate += parsedVeryBigInteger[index];
            } else {
                valueToEvaluate -= parsedVeryBigInteger[index];
            }
        }

        return MathUtils.isDivisibleBy(valueToEvaluate, 7);   
    }
    
}
