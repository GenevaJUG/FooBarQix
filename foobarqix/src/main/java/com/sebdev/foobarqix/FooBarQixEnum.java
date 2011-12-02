package com.sebdev.foobarqix;

/**
 * Contains all the divisors for FooBarQix algorithm
 */
public enum FooBarQixEnum {
    

    FOO(3, "Foo"),
    BAR(5, "Bar"),
    QIX(7, "Qix");
    
    private int valueInt;
    private char valueChar;
    private String result;
    
    FooBarQixEnum(int value, String result) {
        this.valueInt = value;
        this.valueChar = Integer.toString(value).charAt(0);
        this.result = result;
    }
    
    /**
     * Return the value of the divisor
     */
    public int getDivisor(){
        return this.valueInt;
    }
    
    /**
     * Return the disisor  converted into char
     * It's used to optimised some algorithm evaluations
     */
    public char getDivisorChar(){
        return this.valueChar;
    }
    
    /**
     * return the replacement value of FooBarQix algorithm
     */
    public String getResult(){
        return this.result;
    }
}
