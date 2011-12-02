package com.sebdev.foobarqix.rule;

import com.sebdev.foobarqix.FooBarQixEnum;

public class UnknowCriteriaRule extends RuntimeException {

    public UnknowCriteriaRule(int divisor) {
        super("Criteria rule unkwown for divisor " + divisor);
    }

    UnknowCriteriaRule(FooBarQixEnum fooBarQixEnum) {
        super("Criteria rule unkwown for rule " + fooBarQixEnum);
    }
    
}
