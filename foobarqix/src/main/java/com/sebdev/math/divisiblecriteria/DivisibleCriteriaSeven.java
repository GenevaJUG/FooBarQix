package com.sebdev.math.divisiblecriteria;

import com.sebdev.math.MathUtils;

/**
 * Implementation of criteria rule specific to divisor 7
 */
public class DivisibleCriteriaSeven extends AbstractDivisibleCriteria {

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

    @Override
    public int getDivisorValue() {
        return 7;
    }
    
}
