package com.sebdev.translation.rule;

import org.junit.Test;
import static org.junit.Assert.*;

public class RuleDivisibleTest {
    
    @Test
    public void testIsValidSuccessForJavaInteger() {
        Rule rule = new RuleDivisible(3, "Foo");
        assertEquals("the integer should be divisible for a Foo evaluation", "Foo", rule.translate("3"));
    }
    
    @Test
    public void testIsValidSuccessForVeryBigInteger() {
        Rule rule = new RuleDivisible(3, "Foo");
        assertEquals("the very big integer should be divisible for a Foo evaluation", "Foo", rule.translate("333333333333333333333333"));
    }
}
