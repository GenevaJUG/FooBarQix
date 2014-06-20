package ch.bznmith;

import org.fest.assertions.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FooBarQixTest {

	@DataProvider(name="inputOutputFBQ")
	protected Object[][] getInputOutputCandidates() {
		return new Object[][] {
				{1, "1"},
				{2, "2"},
				{3, "FooFoo"},
				{4, "4"},
				{5, "BarBar"},
				{6, "Foo"},
				{7, "QixQix"},
				{8, "8"},
				{9, "Foo"},
				{10, "Bar"},
				{11, "11"},
				{12, "Foo"},
				{13, "Foo"},
				{14, "Qix"},
				{15, "FooBarBar"},
				{16, "16"},
				{17, "Qix"},
				{18, "Foo"},
				{19, "19"},
				{33, "FooFooFoo"},
				{35, "BarQixFooBar"},
				{45, "FooBarBar"},
				{53, "BarFoo"},
				{55, "BarBarBar"},
				{75, "FooBarQixBar"},
				{77, "QixQixQix"},
		};
	}

	@Test(dataProvider="inputOutputFBQ")
	public void shouldReturnFooBarQixedString(int input, String output) {
		Assertions.assertThat(new FooBarQix().convert(input)).isEqualTo(output);
	}
}
