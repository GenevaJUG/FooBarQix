package com.sebdev.foobarqix.rule.criteria;

public class CriteriaVeryBigIntegerFormatException extends RuntimeException {

    public CriteriaVeryBigIntegerFormatException(String value, Exception ex) {
        super("Value " + value + " is not an valid integer", ex);
    }
    
}
