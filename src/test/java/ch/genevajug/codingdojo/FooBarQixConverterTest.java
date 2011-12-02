package ch.genevajug.codingdojo;

import static org.fest.assertions.Assertions.assertThat;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author "Alban Auzeill"
 */
public class FooBarQixConverterTest {

	public static FooBarQixConverter fooBarQix;

	@BeforeClass
	public void beforeClass() {
		fooBarQix = new FooBarQixConverter();
	}

	@DataProvider(name = "FooBarQixData")
	public Object[][] getIntLiterralArray() {
		return new Object[][] { { 1, "1" }, { 2, "2" }, { 3, "FooFoo" }, { 4, "4" }, { 5, "BarBar" }, { 6, "Foo" }, { 7, "QixQix" }, { 8, "8" }, { 9, "Foo" },
				{ 10, "Bar" }, { 11, "11" }, { 12, "Foo" }, { 13, "Foo" }, { 14, "Qix" }, { 15, "FooBarBar" }, { 33, "FooFooFoo" }, { 99, "Foo" },
				{ 100, "Bar" } };
	}

	@Test(dataProvider = "FooBarQixData")
	public void shouldReturnFooBarQix(int i, String expected) {
		assertThat(fooBarQix.convert(i)).isEqualTo(expected);
	}

}
