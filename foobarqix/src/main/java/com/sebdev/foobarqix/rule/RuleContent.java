package com.sebdev.foobarqix.rule;

import com.sebdev.foobarqix.FooBarQixEnum;


/**
 * Rule used to search if a value match a character from FooBarFixEnum
 */
public class RuleContent implements Rule {
    
    private char car;
    
    /**
     * Prepare the rule for a character to evaluate
     */
    public RuleContent(char car) {
        this.car = car;
    }
    
    /**
     * return true if entered character match with the foobarqix character in parameter
     */
    @Override
    public boolean isValid(FooBarQixEnum fooBarQixEnum) {
        return compareTo(fooBarQixEnum.getDivisorChar());
    }

    private boolean compareTo(char character) {
        return car == character;
    }
}
