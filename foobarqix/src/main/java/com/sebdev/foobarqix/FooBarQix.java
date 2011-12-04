package com.sebdev.foobarqix;

import com.sebdev.translation.TranslationEngine;
import com.sebdev.math.VeryBigInteger;
import com.sebdev.translation.rule.Rule;
import com.sebdev.translation.rule.RuleComparedContent;
import com.sebdev.translation.rule.RuleDivisible;
import java.util.ArrayList;
import java.util.List;

/**
 * FooBarQix algorithm
 */
public class FooBarQix {

    //FooBarQix constants
    private static final int FOO_NUMBER = 3;
    private static final String FOO_TEXT = "Foo";
    private static final int BAR_NUMBER = 5;
    private static final String BAR_TEXT = "Bar";
    private static final int QIX_NUMBER = 7;
    private static final String QIX_TEXT = "Qix";
    private final TranslationEngine engine;

    public FooBarQix() {
        List<Rule> rules = initTranslationForFooBarQix();
        engine = new TranslationEngine(rules);
    }

    private boolean hasToBeReturnedAsIt(String userInput) {
        return !VeryBigInteger.isInteger(userInput);
    }

    /**
     * Instanciate Translation Algorithm with FooBarQix rules
     */
    private List<Rule> initTranslationForFooBarQix() {
        List<Rule> rules = new ArrayList<Rule>();
        rules.add(new RuleDivisible(FOO_NUMBER, FOO_TEXT));
        rules.add(new RuleDivisible(BAR_NUMBER, BAR_TEXT));
        rules.add(new RuleDivisible(QIX_NUMBER, QIX_TEXT));
        rules.add(new RuleComparedContent(new int[]{FOO_NUMBER, BAR_NUMBER, QIX_NUMBER},
                new String[]{FOO_TEXT, BAR_TEXT, QIX_TEXT}));
        return rules;
    }

    /**
     * Execute the FooBarQix on the user inupt
     */
    protected String compute(String userInput) {
        if (hasToBeReturnedAsIt(userInput)) {
            return userInput;
        }
        return engine.compute(userInput);
    }
}
