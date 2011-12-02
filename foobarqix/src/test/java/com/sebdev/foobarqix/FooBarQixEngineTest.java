package com.sebdev.foobarqix;

import org.junit.Test;
import static org.junit.Assert.*;

public class FooBarQixEngineTest {

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
        assertFooBarQix("6", "Foo");
    }

    @Test
    public void testComputeNumberContent() {
        assertFooBarQix("13", "Foo");
    }

    @Test
    public void testComputeDivisorBeforeContent() {
        assertFooBarQix("51", "FooBar");
    }

    @Test
    public void testComputeContentInOrder() {
        assertFooBarQix("53", "BarFoo");
    }

    @Test
    public void testComputeMultipleOrder() {
        assertFooBarQix("21", "FooQix");
    }

    @Test
    public void testComputeForMultipleDivisors() {
        assertFooBarQix("15", "FooBarBar");
    }

    @Test
    public void testComputeMultipleContent() {
        assertFooBarQix("33", "FooFooFoo");
    }
    
    @Test
    public void testComputeVeryBigInteger() {
        assertFooBarQix("333333555555777777", "FooQixFooFooFooFooFooFooBarBarBarBarBarBarQixQixQixQixQixQix");
    }

    private void assertFooBarQix(final String input, final String expectedResult) {
        FooBarQixEngine fooBarQix = new FooBarQixEngine(input);
        assertEquals("Not the good result", expectedResult, fooBarQix.compute());
    }
}
