import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 */
public class TestFooBarQuix {

    @Test
    public void highLevelTests(){
        assertIntToFooBarQix(51 , "FooBar");
        assertIntToFooBarQix(53 , "BarFoo");
        assertIntToFooBarQix(21 , "FooQix");
        assertIntToFooBarQix(13 , "Foo");
        assertIntToFooBarQix(15 , "FooBarBar");
        assertIntToFooBarQix(33 , "FooFooFoo");
    }

    private void assertIntToFooBarQix(int i, String fooBar) {
        assertEquals(new FooBarQix(i).getFBQLine(), fooBar);
    }

    @Test
    public void perf(){
        long startTime = System.currentTimeMillis();
        for (int i = 1; i < 1000000; i++) {
            new FooBarQix(i).getFBQLine();
        }
        System.out.println("1 000 000 en " + (System.currentTimeMillis() - startTime) + " ms.");
    }

}
