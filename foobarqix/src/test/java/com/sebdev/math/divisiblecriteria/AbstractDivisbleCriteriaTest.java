package com.sebdev.math.divisiblecriteria;

import org.junit.Test;
import static org.junit.Assert.*;

public class AbstractDivisbleCriteriaTest {

    private class AbstractCriteriaImpl extends AbstractDivisibleCriteria {

        public boolean isDivisible(String value) {
            throw new UnsupportedOperationException("Not supported.");
        }

        @Override
        public int getDivisorValue() {
            throw new UnsupportedOperationException("Not supported.");
        }
    }

    @Test
    public void testParseStringToIntArrayWithNumberOfDigitNotMultipleOfHashLenght() {
        int[] expected = new int[]{99, 888, 777, 666};
        AbstractDivisibleCriteria criteria = new AbstractCriteriaImpl();
        int[] result = criteria.parseStringToIntArray("99888777666", 3);
        for (int index = 0; index < expected.length; index++) {
            assertEquals(expected[index], result[index]);
        }
    }

    @Test
    public void testParseStringToIntArrayWithNumberOfDigitMultipleOfHashLenght() {
        int[] expected = new int[]{999, 888, 777, 666};
        AbstractDivisibleCriteria criteria = new AbstractCriteriaImpl();
        int[] result = criteria.parseStringToIntArray("999888777666", 3);
        for (int index = 0; index < expected.length; index++) {
            assertEquals(expected[index], result[index]);
        }
    }

    @Test
    public void testParseStringToIntArrayWithLenghtOne() {
        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        AbstractDivisibleCriteria criteria = new AbstractCriteriaImpl();
        int[] result = criteria.parseStringToIntArray("123456789", 1);
        for (int index = 0; index < expected.length; index++) {
            assertEquals(expected[index], result[index]);
        }
    }
}
