package com.sebdev.foobarqix.rule;

import com.sebdev.foobarqix.FooBarQixEnum;
import com.sebdev.foobarqix.rule.criteria.CriteriaVeryBigIntegerFormatException;
import org.junit.Test;
import static org.junit.Assert.*;

public class RuleDivisorTest {
    
    @Test
    public void testIsValidSuccessForJavaInteger() {
        Rule rule = new RuleDivisor("3");
        assertTrue("the integer should be divisible for a Foo evaluation", rule.isValid(FooBarQixEnum.FOO));
    }
    
    @Test
    public void testIsValidSuccessForVeryBigInteger() {
        Rule rule = new RuleDivisor("333333333333333333333333");
        assertTrue("the very big integer should be divisible for a Foo evaluation", rule.isValid(FooBarQixEnum.FOO));
    }
        
    @Test(expected=CriteriaVeryBigIntegerFormatException.class)
    public void testIsValidError() {
        Rule rule = new RuleDivisor("test");
        rule.isValid(FooBarQixEnum.FOO);
    }
}
