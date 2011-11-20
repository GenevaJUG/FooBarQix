package com.github.genevajug.foo.bar.qix.converter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberConverterTest {
    
    private NumberConverter numberConverter;

    @Before
    public void before(){
        numberConverter = new NumberConverter();
    }


    @Test
        public void shouldReturn1WhenTheNumberIsDivisibleBy1(){
            assertEquals("1", numberConverter.convert(1));
        }


    @Test
        public void shouldReturn2WhenTheNumberIsDivisibleBy2(){
            assertEquals("2", numberConverter.convert(2));
            //Assertions.assertThat(numberConverter.convert(3)).isEqualTo("foo");
        }

    @Test
    public void shouldReturnFooWhenTheNumberIsDivisibleBy3(){
        assertEquals("FooFoo", numberConverter.convert(3));
    }

    @Test
    public void shouldReturn4WhenTheNumberIsDivisibleBy4(){
            assertEquals("4", numberConverter.convert(4));
    }

    @Test
    public void shouldReturn5WhenTheNumberIsDivisibleByBarBar(){
            assertEquals("BarBar", numberConverter.convert(5));
    }

    @Test
    public void shouldReturnFooWhenTheNumberIsDivisibleBy6(){
        assertEquals("Foo", numberConverter.convert(6));
    }

    @Test
    public void shouldReturnQixQixWhenTheNumberIsDivisibleBy7(){
        assertEquals("QixQix", numberConverter.convert(7));
    }

    @Test
    public void shouldReturn8WhenTheNumberIsDivisibleBy8(){
        assertEquals("8", numberConverter.convert(8));
    }

    @Test
    public void shouldReturnFooWhenTheNumberIsDivisibleBy9(){
        assertEquals("Foo", numberConverter.convert(9));
    }

    @Test
    public void shouldReturnBarWhenTheNumberIsDivisibleBy10(){
        assertEquals("Bar", numberConverter.convert(10));
    }

    @Test
    public void shouldReturnFooBarWhenTheNumberIs51(){
        assertEquals("FooBar", numberConverter.convert(51));
    }

    @Test
    public void shouldReturnFooBarWhenTheNumberIs53(){
        assertEquals("BarFoo", numberConverter.convert(53));
    }

    @Test
    public void shouldReturnFooBarWhenTheNumberIs21(){
        assertEquals("FooQix", numberConverter.convert(21));
    }

    @Test
    public void shouldReturnFooBarWhenTheNumberIs13(){
        assertEquals("Foo", numberConverter.convert(13));
    }

    @Test
        public void shouldReturnFooBarWhenTheNumberIs15(){
            assertEquals("FooBarBar", numberConverter.convert(15));
        }

    @Test
    public void shouldReturnFooBarWhenTheNumberIs33(){
        assertEquals("FooFooFoo", numberConverter.convert(33));
    }

    @Test
    public void shouldReturnFooBarBarWhenTheNumberIs45(){
        assertEquals("FooBarBar", numberConverter.convert(45));
    }

}
