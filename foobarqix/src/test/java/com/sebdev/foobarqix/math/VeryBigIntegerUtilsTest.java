package com.sebdev.foobarqix.math;

import org.junit.Test;
import static org.junit.Assert.*;

public class VeryBigIntegerUtilsTest {

    @Test
    public void testIsIntegerSucess() {
        assertTrue("Number should be evaluated as a valid integer", VeryBigIntegerUtils.isInteger("1111111111111111111111111111"));
    }

    @Test
    public void testIsIntegerError() {
        assertFalse("Alphanumeric value should not be evaluated as a valid integer", VeryBigIntegerUtils.isInteger("a111111111111111111111111111"));
    }
}
