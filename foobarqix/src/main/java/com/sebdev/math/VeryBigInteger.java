package com.sebdev.math;

import com.sebdev.math.divisiblecriteria.UnknowCriteriaRule;
import com.sebdev.math.divisiblecriteria.AbstractDivisibleCriteria;
import com.sebdev.math.divisiblecriteria.DivisbleCriteriaFive;
import com.sebdev.math.divisiblecriteria.DivisibleCriteriaSeven;
import com.sebdev.math.divisiblecriteria.DivisibleCriteriaThree;
import java.util.HashMap;
import java.util.Map;

/**
 * Specific Methods for what we call a very big integer in this project
 */
public class VeryBigInteger {

    private static final Map<Integer, AbstractDivisibleCriteria> divisibleCriteria;

    static {
        divisibleCriteria = new HashMap<Integer, AbstractDivisibleCriteria>();
        DivisibleCriteriaThree dc3 = new DivisibleCriteriaThree();
        divisibleCriteria.put(dc3.getDivisorValue(), dc3);
        DivisbleCriteriaFive dc5 = new DivisbleCriteriaFive();
        divisibleCriteria.put(dc5.getDivisorValue(), dc5);
        DivisibleCriteriaSeven dc7 = new DivisibleCriteriaSeven();
        divisibleCriteria.put(dc7.getDivisorValue(), dc7);
    }
    private final String value;

    public VeryBigInteger(String value) {
        this.value = value;
    }

    /**
     * Return true if the veryBigInterger is divisible by divisor
     */
    public boolean isDivisibleBy(int divisor) {
        try {
            int intValue = Integer.valueOf(this.value);
            return MathUtils.isDivisibleBy(intValue, divisor);
        } catch (NumberFormatException ex) {
            //For a too big integer, we need to use defined criteria
            if (!divisibleCriteria.containsKey(divisor)) {
                throw new UnknowCriteriaRule(divisor);
            }
            return divisibleCriteria.get(divisor).isDivisible(this.value);
        }
    }

    /**
     * return true if the parameter is an integer
     */
    public static boolean isInteger(String value) {
        for (char car : value.toCharArray()) {
            if (!Character.isDigit(car)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return value;
    }
}
