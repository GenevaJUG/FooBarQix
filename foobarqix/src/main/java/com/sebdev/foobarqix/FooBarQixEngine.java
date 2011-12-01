package com.sebdev.foobarqix;

import com.sebdev.foobarqix.math.VeryBigIntegerUtils;
import com.sebdev.foobarqix.rule.Rule;
import com.sebdev.foobarqix.rule.RuleDivisor;
import com.sebdev.foobarqix.rule.RuleContent;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

/**
 * FooBarQix algorithm
 */
public class FooBarQixEngine {
    
    private final String value;
    
    /**
     * Create a fooBarQix engine ready for the parameter entered
     */
    public FooBarQixEngine(String value) {
        this.value = value;
    }
    
    /**
     * return the foobarqix result for this.value
     */   
    public String compute() {
        
        if (!VeryBigIntegerUtils.isInteger(this.value)) {
            return this.value;
        }
        List<Rule> rules = prepareRules();
        String result = computeRules(rules);
        
        if (result.isEmpty()) {
            return this.value;
        }
        
        return result;
    }
    
    private List<Rule> prepareRules() {
        List<Rule> rules = new ArrayList<Rule>();
        rules.add(new RuleDivisor(value));
        for (int j = 0; j < value.length(); j++) {
            char car = value.charAt(j);
            rules.add(new RuleContent(car));
        }
        return rules;
    }
    
    private String computeRules(List<Rule> rules) {
        String result = "";
        for (Rule rule : rules) {
            result += computeRule(rule);
        }
        return result;
    }
    
    private String computeRule(Rule rule) {
        String result = "";
        List<FooBarQixEnum> fooBars = Arrays.asList(FooBarQixEnum.values());
        for (FooBarQixEnum fooBar : fooBars) {
            if (rule.isValid(fooBar)) {
                result += fooBar.getResult();
            }
        }
        return result;
    }
}
