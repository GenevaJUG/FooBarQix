import static junit.framework.Assert.assertEquals;

import org.junit.Test;

public class FooBarQixTest {

	private FooBarQixGenerator fooBarQix = new FooBarQixGenerator();
	
	@Test
	public void shouldReturn1WhenNumber1() {
		final String value = fooBarQix.valueOf(1);
		assertEquals("1", value);
	}
	
	@Test
	public void shouldReturn2WhenNumber2() {
		final String value = fooBarQix.valueOf(2);
		assertEquals("2", value);
	}
	
	@Test
	public void shouldReturnFooFooWhenNumber3() {
		final String value = fooBarQix.valueOf(3);
		assertEquals("FooFoo", value);
	}
	
	@Test
	public void shouldReturn4WhenNumber4() {
		final String value = fooBarQix.valueOf(4);
		assertEquals("4", value);
	}
	
	@Test
	public void shouldReturnBarBarWhenNumber5() {
		final String value = fooBarQix.valueOf(5);
		assertEquals("BarBar", value);
	}
	
	@Test
	public void shouldReturnFooWhenNumber6() {
		final String value = fooBarQix.valueOf(6);
		assertEquals("Foo", value);
	}

	@Test
	public void shouldReturnQixQixWhenNumber7() {
		final String value = fooBarQix.valueOf(7);
		assertEquals("QixQix", value);
	}

	@Test
	public void shouldReturn8WhenNumber8() {
		final String value = fooBarQix.valueOf(8);
		assertEquals("8", value);
	}

	@Test
	public void shouldReturnFooWhenNumber9() {
		final String value = fooBarQix.valueOf(9);
		assertEquals("Foo", value);
	}

	@Test
	public void shouldReturnBarWhenNumber10() {
		final String value = fooBarQix.valueOf(10);
		assertEquals("Bar", value);
	}

	@Test
	public void shouldReturnFooBarWhenNumber51() {
		final String value = fooBarQix.valueOf(51);
		assertEquals("FooBar", value);
	}

	@Test
	public void shouldReturnBarFooWhenNumber53() {
		final String value = fooBarQix.valueOf(53);
		assertEquals("BarFoo", value);
	}

	@Test
	public void shouldReturnFooQixWhenNumber21() {
		final String value = fooBarQix.valueOf(21);
		assertEquals("FooQix", value);
	}

	@Test
	public void shouldReturnFooWhenNumber13() {
		final String value = fooBarQix.valueOf(13);
		assertEquals("Foo", value);
	}

	@Test
	public void shouldReturnFooBarBarWhenNumber15() {
		final String value = fooBarQix.valueOf(15);
		assertEquals("FooBarBar", value);
	}

	@Test
	public void shouldReturnFooFooFooWhenNumber33() {
		final String value = fooBarQix.valueOf(33);
		assertEquals("FooFooFoo", value);
	}

	@Test
	public void shouldReturnFooBarQixBarWhenNumber75() {
		final String value = fooBarQix.valueOf(75);
		assertEquals("FooBarQixBar", value);
	}
}
