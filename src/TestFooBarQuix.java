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
        assertEquals(new FooBarQix(i,i).allLines(), fooBar+'\n');
    }

    @Test
    public void perf(){
        long startTime = System.currentTimeMillis();
        new FooBarQix(1, 1000000);
        System.out.println("1 000 000 en " + (System.currentTimeMillis() - startTime) + " ms.");
    }

}
