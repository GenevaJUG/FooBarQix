package test.ch.genevaJug.fooBarQix;

import org.fest.assertions.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ch.genevaJug.fooBarQix.FooBarQixConverter;


public class FooBarQixConverterTestJunit {
    @DataProvider(name = "intToValue")
    public Object[][] getIntValueArray(){
        return new Object[][] {
                {1,"1"},
                {2,"2"},
                {3,"FooFoo"},
                {4,"4"},
                {5,"BarBar"},
                {6,"Foo"},
                {7,"QixQix"},
                {8,"8"},
                {9,"Foo"},
                {10,"Bar"},
                {11,"11"},
                {12,"Foo"},
                {13,"Foo"},
                {14,"Qix"},
                {15,"FooBarBar"},
                {16,"16"},
                {17,"Qix"},
                {18,"Foo"},
                {19,"19"},
                {20,"Bar"},
                {21,"FooQix"},
                {22,"22"},
                {23,"Foo"},
                {30,"FooBarFoo"},
                {33,"FooFooFoo"},
                {35,"BarQixFooBar"},
                {51,"FooBar"},
                {53,"BarFoo"},
                {55,"BarBarBar"},
                {57,"FooBarQix"},
                {75,"FooBarQixBar"},
        };
    }
    
    @Test(dataProvider = "intToValue")
    public void shouldReturnValue(int i, String value) {
        FooBarQixConverter converter = FooBarQixConverter.getInstance();
        Assertions.assertThat(converter.convert(i)).isEqualTo(value);
    }
}
