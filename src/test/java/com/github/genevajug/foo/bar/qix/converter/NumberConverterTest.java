package com.github.genevajug.foo.bar.qix.converter;

import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class NumberConverterTest {

    private NumberConverter numberConverter;

    @Before
    public void before() {
        numberConverter = new NumberConverter();
    }

    @Test
    public void shouldReturn1WhenTheNumberIsDivisibleBy1() {
        assertThat(numberConverter.convert(1)).isEqualTo("1");
    }

    @Test
    public void shouldReturn2WhenTheNumberIsDivisibleBy2() {
        assertThat(numberConverter.convert(2)).isEqualTo("2");
    }

    @Test
    public void shouldReturnFooWhenTheNumberIsDivisibleBy3() {
        assertThat(numberConverter.convert(3)).isEqualTo("FooFoo");
    }

    @Test
    public void shouldReturn4WhenTheNumberIsDivisibleBy4() {
        assertThat(numberConverter.convert(4)).isEqualTo("4");
    }

    @Test
    public void shouldReturn5WhenTheNumberIsDivisibleByBarBar() {
        assertThat(numberConverter.convert(5)).isEqualTo("BarBar");
    }

    @Test
    public void shouldReturnFooWhenTheNumberIsDivisibleBy6() {
        assertThat(numberConverter.convert(6)).isEqualTo("Foo");
    }

    @Test
    public void shouldReturnQixQixWhenTheNumberIsDivisibleBy7() {
        assertThat(numberConverter.convert(7)).isEqualTo("QixQix");
    }

    @Test
    public void shouldReturn8WhenTheNumberIsDivisibleBy8() {
        assertThat(numberConverter.convert(8)).isEqualTo("8");
    }

    @Test
    public void shouldReturnFooWhenTheNumberIsDivisibleBy9() {
        assertThat(numberConverter.convert(9)).isEqualTo("Foo");
    }

    @Test
    public void shouldReturnBarWhenTheNumberIsDivisibleBy10() {
        assertThat(numberConverter.convert(10)).isEqualTo("Bar");
    }

    @Test
    public void shouldReturnFooBarWhenTheNumberIs51() {
        assertThat(numberConverter.convert(51)).isEqualTo("FooBar");
    }

    @Test
    public void shouldReturnBarFooWhenTheNumberIs53() {
        assertThat(numberConverter.convert(53)).isEqualTo("BarFoo");
    }

    @Test
    public void shouldReturnFooQixWhenTheNumberIs21() {
        assertThat(numberConverter.convert(21)).isEqualTo("FooQix");
    }

    @Test
    public void shouldReturnFooWhenTheNumberIs13() {
        assertThat(numberConverter.convert(13)).isEqualTo("Foo");
    }

    @Test
    public void shouldReturnFooBarBarWhenTheNumberIs15() {
        assertThat(numberConverter.convert(15)).isEqualTo("FooBarBar");
    }

    @Test
    public void shouldReturnFooFooFooWhenTheNumberIs33() {
        assertThat(numberConverter.convert(33)).isEqualTo("FooFooFoo");
    }

    @Test
    public void shouldReturnFooBarBarWhenTheNumberIs45() {
        assertThat(numberConverter.convert(45)).isEqualTo("FooBarBar");
    }
}
