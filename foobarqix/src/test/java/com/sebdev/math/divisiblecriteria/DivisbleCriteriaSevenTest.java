package com.sebdev.math.divisiblecriteria;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DivisbleCriteriaSevenTest {
    
    private static DivisibleCriteriaSeven criteria;
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        criteria = new DivisibleCriteriaSeven();
    }

    @Test
    public void testIsDivisibleTrue() {
        assertTrue("the value is divisible by 7", criteria.isDivisible("5527579818992"));
    }
        
    @Test
    public void testIsDivisibleFalse() {
        assertFalse("the value is not divisible by 7", criteria.isDivisible("111111111111111111111"));
    }
}
