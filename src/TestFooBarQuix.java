import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 */
public class TestFooBarQuix {

    @Test
    public void highLevelTests(){
        assertIntToFooBarQix(1  , "1");
        assertIntToFooBarQix(2  , "2");
        assertIntToFooBarQix(3  , "FooFoo");
        assertIntToFooBarQix(6  , "Foo");
        assertIntToFooBarQix(13 , "Foo");
        assertIntToFooBarQix(15 , "FooBarBar");
        assertIntToFooBarQix(33 , "FooFooFoo");
        assertIntToFooBarQix(21 , "FooQix");
        assertIntToFooBarQix(51 , "FooBar");
        assertIntToFooBarQix(53 , "BarFoo");
    }

    private void assertIntToFooBarQix(int i, String fooBar) {
        assertEquals(new FooBarQix(i).getReplacementLine(), fooBar);
    }

    @Test
    public void perf(){
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < 1000001; i++) {
            new FooBarQix(i).getReplacementLine();
        }
        System.out.println("1 000 000 en " + (System.currentTimeMillis() - startTime) + " ms.");
    }

}
