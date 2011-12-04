package com.sebdev.foobarqix;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FooBarQixTest {

    private static FooBarQix barQix;

    @BeforeClass
    public static void setupClass() {
        barQix = new FooBarQix();
    }

    @Test
    public void testComputeNotANumber() {
        assertFooBarQix("Hello world", "Hello world");
    }

    @Test
    public void testComputeNoMatch() {
        assertFooBarQix("1", "1");
    }

    @Test
    public void testComputeMultiple() {
        assertFooBarQix("Foo", "6");
    }

    @Test
    public void testComputeNumberContent() {
        assertFooBarQix("Foo", "13");
    }

    @Test
    public void testComputeDivisorBeforeContent() {
        assertFooBarQix("FooBar", "51");
    }

    @Test
    public void testComputeContentInOrder() {
        assertFooBarQix("BarFoo", "53");
    }

    @Test
    public void testComputeMultipleOrder() {
        assertFooBarQix("FooQix", "21");
    }

    @Test
    public void testComputeForMultipleDivisors() {
        assertFooBarQix("FooBarBar", "15");
    }

    @Test
    public void testComputeMultipleContent() {
        assertFooBarQix("FooFooFoo", "33");
    }

    @Test
    public void testComputeVeryBigInteger() {
        assertFooBarQix("FooQixFooFooFooFooFooFooBarBarBarBarBarBarQixQixQixQixQixQix", "333333555555777777");
    }

    @Test
    public void testComputeListValue() {
        boolean result = barQix.compute("list").startsWith("1" + System.lineSeparator() + "2");
        assertTrue("Compulting the reserved word list shoud return foobarqix result", result);

    }

    private void assertFooBarQix(final String expectedResult, final String input) {
        assertEquals("Not the good result", expectedResult, barQix.compute(input));
    }
}
