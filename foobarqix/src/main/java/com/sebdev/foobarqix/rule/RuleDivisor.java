package com.sebdev.foobarqix.rule;

import com.sebdev.foobarqix.FooBarQixEnum;

public class RuleDivisor implements Rule {

    private final int value;

    public RuleDivisor(int value) {
        this.value = value;
    }

    @Override
    public boolean isValid(FooBarQixEnum fooBarQixEnum) {
        return isFooBarQixMultiple(fooBarQixEnum);
    }

    private boolean isFooBarQixMultiple(FooBarQixEnum fooBarQixEnum) {
        return (value % fooBarQixEnum.getDivisor()) == 0;
    }
}
