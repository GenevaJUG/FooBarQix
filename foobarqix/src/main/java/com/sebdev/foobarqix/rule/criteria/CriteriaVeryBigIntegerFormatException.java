package com.sebdev.foobarqix.rule.criteria;

public class CriteriaVeryBigIntegerFormatException extends RuntimeException {

    public CriteriaVeryBigIntegerFormatException(String value) {
        super("Value " + value + " is not an valid integer");
    }
    
}
