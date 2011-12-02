package com.sebdev.foobarqix.rule;

import com.sebdev.foobarqix.FooBarQixEnum;
import org.junit.Test;
import static org.junit.Assert.*;

public class RuleContentTest {
    
    @Test
    public void testIsValidSuccess() {
        Rule rule = new RuleContent('3');
        assertTrue("3 should be a Foo valid content", rule.isValid(FooBarQixEnum.FOO));
    }
    
    @Test
    public void testIsValidError() {
        Rule rule = new RuleContent('1');
        assertFalse("5 should not be a Foo valid content", rule.isValid(FooBarQixEnum.FOO));
    }
}
