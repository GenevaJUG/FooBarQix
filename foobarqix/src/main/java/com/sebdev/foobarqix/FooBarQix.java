package com.sebdev.foobarqix;

import com.sebdev.translation.TranslationEngine;
import com.sebdev.math.VeryBigInteger;
import com.sebdev.translation.rule.Rule;
import com.sebdev.translation.rule.RuleComparedContent;
import com.sebdev.translation.rule.RuleDivisible;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    //User inputs constants
    private static final String EXIT_CHAR = "q";
    private static final String WRITE_0_100 = "list";
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
     * Usage: 
     *   enter q to exit program
     *   enter list to writer foobarqix for numbers 1 to 100
     *   enter any value to display the foobarqix result
     */
    public static void main(String[] args) throws Exception {
        FooBarQix barQix = new FooBarQix();
        String userInput = null;
        while (!EXIT_CHAR.equals(userInput)) {
            System.out.print("Veuillez saisir une valeur (list pour 0-100; q pour sortir):");
            userInput = inputString();
            System.out.println(barQix.compute(userInput));
        }
    }

    private static String inputString() throws IOException {
        BufferedReader inr = new BufferedReader(new InputStreamReader(System.in));
        return (inr.readLine());
    }

    /**
     * Execute the FooBarQix on the user inupt
     */
    protected String compute(String userInput) {
        if (hasToBeComputedForNumbers1To100(userInput)) {
            return computeForNumbers1To100();
        }
        if (hasToBeReturnedAsIt(userInput)) {
            return userInput;
        }
        return engine.compute(userInput);
    }

    private boolean hasToBeComputedForNumbers1To100(String userInput) {
        return WRITE_0_100.equals(userInput);
    }

    private String computeForNumbers1To100() {
        StringBuilder sb = new StringBuilder();
        for (int number = 1; number <= 100; number++) {
            sb.append(engine.compute(Integer.toString(number)));
            sb.append(System.lineSeparator());
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
