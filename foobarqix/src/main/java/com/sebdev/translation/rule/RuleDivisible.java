package com.sebdev.translation.rule;

import com.sebdev.math.VeryBigInteger;

/**
 * Rule used to search if a value is divible by a number
 */
public class RuleDivisible implements Rule {
    
    private final int divisor;
    private final String translationValue;

    /**
     * Prepare the rule for a number to evaluate
     * @param value must be an integer
     */
    public RuleDivisible(int divisor, String translationValue) {
        this.divisor = divisor;
        this.translationValue = translationValue;
    }
  
    /**
     * return the translationValue if the value is divisble by divisor
     */
    @Override
    public String translate(String value) {
        VeryBigInteger bigInteger = new VeryBigInteger(value);
        if (bigInteger.isDivisibleBy(divisor)) {
            return translationValue;
        }
        return "";
    }
}
