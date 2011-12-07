package ch.jug.geneva.foobarqix;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author <a href="mailto:rueinegni@gmail.com>rueinegni</a>
 * @since 12/7/11 10:53 PM
 */
public class FooBarQixTest {
    @Test
    public void testAffiche() throws Exception {
        Assert.assertEquals("1", new FooBarQix().affiche(1));
        Assert.assertEquals("2", new FooBarQix().affiche(2));
    }
}
