package com.sebdev.math.divisiblecriteria;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivisbleCriteriaThreeTest {
    
    private static DivisibleCriteriaThree criteria;
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        criteria = new DivisibleCriteriaThree();
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
