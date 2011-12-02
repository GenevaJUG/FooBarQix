package com.sebdev.foobarqix.rule.criteria;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CriteriaThreeTest {
    
    private static CriteriaThree criteria;
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        criteria = new CriteriaThree();
    }

    @Test
    public void testIsDivisibleTrue() {
        assertTrue("Number is divisible by 3", criteria.isDivisible("333333333333333333333"));
    }
    
    @Test
    public void testIsDivisibleFalse() {
        assertFalse("Number is not divisible by 3", criteria.isDivisible("333333333333333333332"));
    }
}
