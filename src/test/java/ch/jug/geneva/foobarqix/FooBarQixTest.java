package ch.jug.geneva.foobarqix;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author <a href="mailto:rueinegni@gmail.com>rueinegni</a>
 * @since 12/7/11 10:53 PM
 */
public class FooBarQixTest {

    private FooBarQix fooBarQix;

    @Before
    public void setUp() throws Exception {
        fooBarQix = new FooBarQix();
    }

    @Test
    public void testAffiche() throws Exception {
        Assert.assertEquals("1", fooBarQix.affiche(1));
        Assert.assertEquals("2", fooBarQix.affiche(2));
    }

    @Test
    public void siLeNombreEstDivisiblePar3OuContient3EcrireFooALaPlaceDe3() {
        Assert.assertEquals("FooFoo", fooBarQix.affiche(3));
        Assert.assertEquals("Foo", fooBarQix.affiche(6));
    }

    @Test
    public void siLeNombreEstDivisiblePar5OuContient5EcrireBarALaPlaceDe5() {
        Assert.assertEquals("BarBar", fooBarQix.affiche(5));
        Assert.assertEquals("Bar", fooBarQix.affiche(10));
    }

    @Test
    public void siLeNombreEstDivisiblePar7OuContient7EcrireQixALaPlaceDe7() {
        Assert.assertEquals("QixQix", fooBarQix.affiche(7));
        Assert.assertEquals("Qix", fooBarQix.affiche(14));
    }
}
