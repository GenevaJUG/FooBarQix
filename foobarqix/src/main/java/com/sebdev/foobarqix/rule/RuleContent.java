package com.sebdev.foobarqix.rule;

import com.sebdev.foobarqix.FooBarQixEnum;


public class RuleContent implements Rule {
    
    private char car;
    
    public RuleContent(char car) {
        this.car = car;
    }
    
    @Override
    public boolean isValid(FooBarQixEnum fooBarQixEnum) {
        return isFooBarQix(fooBarQixEnum);
    }

    private boolean isFooBarQix(FooBarQixEnum fooBar) {
        return car == fooBar.getDivisorChar();
    }

    
}
