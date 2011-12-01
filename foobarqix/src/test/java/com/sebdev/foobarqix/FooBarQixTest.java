/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebdev.foobarqix;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sdevolder
 */
public class FooBarQixTest {
    
    public FooBarQixTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
        @Test
    public void testgetResultNotANumber() {
        assertFooBarQix( "Hello world", "Hello world");
    }
    
    @Test
    public void testgetResultNoMatch() {
        assertFooBarQix( "1", "1");
    }
        
    @Test
    public void testgetResultMultiple() {
        assertFooBarQix( "6", "Foo");
    }  
    
    @Test
    public void testgetResultNumberContent() {
        assertFooBarQix( "13", "Foo");
    }  

    @Test
    public void testgetResultDivisorBeforeContent() {
        assertFooBarQix( "51", "FooBar");
    }
    
    @Test
    public void testgetResultContentInOrder() {
        assertFooBarQix( "53", "BarFoo");
    }
    
      
    @Test
    public void testgetResultMultipleOrder() {
        assertFooBarQix( "21", "FooQix");
    }  
    
      
    @Test
    public void testgetResultForMultipleDivisors() {
        assertFooBarQix( "15", "FooBarBar");
    }  
    
      
    @Test
    public void testgetResultMultipleContent() {
        assertFooBarQix( "33", "FooFooFoo");
    }  
    
    private void assertFooBarQix(final String input, final String expectedResult) {
        FooBarQix fooBarQix = new FooBarQix(input);
        assertEquals("Not the good result", expectedResult, fooBarQix.getresult());
    }
}
