package com.sebdev.math;

import com.sebdev.math.divisiblecriteria.UnknowCriteriaRule;
import org.junit.Test;
import static org.junit.Assert.*;

public class VeryBigIntegerTest {

    @Test
    public void testIsIntegerSucess() {
        assertTrue("Number should be evaluated as a valid integer", VeryBigInteger.isInteger("1111111111111111111111111111"));
    }

    @Test
    public void testIsIntegerError() {
        assertFalse("Alphanumeric value should not be evaluated as a valid integer", VeryBigInteger.isInteger("a111111111111111111111111111"));
    }
    
     @Test
     public void testIsDivisibleByForLittleNumberYes() {
            VeryBigInteger integer = new VeryBigInteger("3");
            assertTrue("3 should be disible by 3", integer.isDivisibleBy(3));
     }
     
     @Test
     public void testIsDivisibleByForLittleNumberNo() {
            VeryBigInteger integer = new VeryBigInteger("4");
            assertFalse("4 should not be disible by 3", integer.isDivisibleBy(3));
     }
    
     @Test
     public void testIsDivisibleByForVeryBigNumberYes() {
            VeryBigInteger integer = new VeryBigInteger("33333333333333333333333333333333333");
            assertTrue("33333333333333333333333333333333333 should be disible by 3", integer.isDivisibleBy(3));
     }
     
     @Test
     public void testIsDivisibleByForVeryBigNumberNo() {
            VeryBigInteger integer = new VeryBigInteger("111111111111111111111111111111111111");
            assertTrue("111111111111111111111111111111111111 should not be disible by 3", integer.isDivisibleBy(3));
     }
     
     @Test(expected=UnknowCriteriaRule.class)
     public void testIsDivisibleByForVeryBigNumberWithCriteriaNotImplemented() {
            VeryBigInteger integer = new VeryBigInteger("111111111111111111111111111111111111");
            assertTrue("Critera divible rule should be detected as not implemented", integer.isDivisibleBy(1));
     }
}
