package ch.genevajug.codingdojo;

import static org.fest.assertions.Assertions.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

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

	@Test
	public void shouldReturnOnStdOut() throws IOException {
		PrintStream previousOut = System.out;
		try {
			String encoding = "UTF-8";
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			System.setOut(new PrintStream(out, true, encoding));
			FooBarQixMain.main(new String[0]);
			String result = new String(out.toByteArray(), encoding);
			assertThat(result).contains("FooFooFoo");
			assertThat(result).contains("BarBarBar");
			assertThat(result).contains("QixQixQix");
		} finally {
			System.setOut(previousOut);
		}
	}

}
