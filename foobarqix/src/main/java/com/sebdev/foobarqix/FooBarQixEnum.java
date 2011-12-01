package com.sebdev.foobarqix;

/**
 * 
 * @author jempe
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
     * Return the divisor for the rule
     */
    public int getDivisor(){
        return this.valueInt;
    }
    
    /**
     * Return the disisor for the rule converted in char
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
