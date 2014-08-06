package com.sebdev.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {

    @Test
    public void testIsDivisibleByTrue() {
        assertTrue("6 should be divisble by 2", MathUtils.isDivisibleBy(6, 2));
    }
    
        @Test
    public void testIsDivisibleByFalse() {
        assertTrue("5 should not be divisble by 2", MathUtils.isDivisibleBy(6, 2));
    }
}
