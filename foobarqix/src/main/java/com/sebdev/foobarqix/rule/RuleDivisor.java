package com.sebdev.foobarqix.rule;

import com.sebdev.foobarqix.FooBarQixEnum;

/**
 * Rule used to search if a value is divible by a number from FooBarFixEnum
 */
public class RuleDivisor implements Rule {

    private final int value;

    /**
     * Prepare the rule for a number to evaluate
     */
    public RuleDivisor(int value) {
        this.value = value;
    }

    /**
     * return true if entered number is divisible by the foobarqix number in parameter
     */
    @Override
    public boolean isValid(FooBarQixEnum fooBarQixEnum) {
        return isDivisibleBy(fooBarQixEnum.getDivisor());
    }

    private boolean isDivisibleBy(int divisor) {
        return (value % divisor) == 0;
    }
}
