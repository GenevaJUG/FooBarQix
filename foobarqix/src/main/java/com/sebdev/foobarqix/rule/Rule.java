package com.sebdev.foobarqix.rule;

import com.sebdev.foobarqix.FooBarQixEnum;

/**
 * Interface to use if a new type of rule is defined for FooBarQix algorithm
 */
public interface Rule {
    
    /**
     * Method that define the rule behaviour
     */
    public boolean isValid(FooBarQixEnum fooBarQixEnum);
}
