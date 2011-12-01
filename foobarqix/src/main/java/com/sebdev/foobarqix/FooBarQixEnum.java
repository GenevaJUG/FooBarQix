/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebdev.foobarqix;

/**
 *
 * @author sdevolder
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
    
    public int getDivisor(){
        return this.valueInt;
    }
    
        public char getDivisorChar(){
        return this.valueChar;
    }
    
    public String getResult(){
        return this.result;
    }
   
}
