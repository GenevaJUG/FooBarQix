package com.sebdev.foobarqix.rule;

import com.sebdev.foobarqix.rule.criteria.CriteriaThree;
import com.sebdev.foobarqix.rule.criteria.AbstractCriteria;
import com.sebdev.foobarqix.rule.criteria.CriteriaFive;
import com.sebdev.foobarqix.rule.criteria.CriteriaSeven;
import com.sebdev.foobarqix.FooBarQixEnum;
import java.util.EnumMap;
import java.util.Map;

/**
 * Rule used to search if a value is divible by a number from FooBarFixEnum
 */
public class RuleDivisor implements Rule {

    private static final Map<FooBarQixEnum, AbstractCriteria> criteriasRules;
    static {
        criteriasRules = new EnumMap<FooBarQixEnum, AbstractCriteria>(FooBarQixEnum.class);
        criteriasRules.put(FooBarQixEnum.FOO, new CriteriaThree());
        criteriasRules.put(FooBarQixEnum.BAR, new CriteriaFive());
        criteriasRules.put(FooBarQixEnum.QIX, new CriteriaSeven());
    }
    
    private final String value;

    /**
     * Prepare the rule for a number to evaluate
     * @param value must be an integer
     */
    public RuleDivisor(String value) {
        this.value = value;
    }
  
    /**
     * return true if entered number is divisible by the foobarqix number in parameter
     */
    @Override
    public boolean isValid(FooBarQixEnum fooBarQixEnum) {
        try {
            int intValue = Integer.valueOf(this.value);
            return isDivisibleBy(intValue, fooBarQixEnum.getDivisor());
        } catch (NumberFormatException ex) {
            //For a too big integer, we need to use defined criteria
            if (!criteriasRules.containsKey(fooBarQixEnum)) {
                throw new UnknowCriteriaRule(fooBarQixEnum);
            }
            return criteriasRules.get(fooBarQixEnum).isDivisible(this.value);
        }
    }

    private boolean isDivisibleBy(int intValue, int divisor) {
        return (intValue % divisor) == 0;
    }
}
