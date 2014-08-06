package com.sebdev.translation;

import com.sebdev.translation.rule.Rule;
import java.util.ArrayList;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TranslationEngineTest {

    private static TranslationEngine engine;

    private static class MockedRule implements Rule {

        private String textTocompare;
        public MockedRule(String textTocompare) {
            this.textTocompare = textTocompare;
        }

        public String translate(String text) {
            return (text.contains(textTocompare)?"MATCH" + textTocompare:"");
        }
    }

    @BeforeClass
    public static void setupClass() {
        List<Rule> rules = new ArrayList<Rule>();
        rules.add(new MockedRule("Hello"));
        rules.add(new MockedRule("World"));
        engine = new TranslationEngine(rules);
    }

    @Test
    public void testComputeResultFound() {
        assertEquals("Not the good result", "MATCHHelloMATCHWorld", engine.compute("Hello World"));
    }
    
    @Test
    public void testComputeNoResultFound() {
        assertEquals("Not the good result", "123456", engine.compute("123456"));
    }
}
