package com.sebdev.translation;

import com.sebdev.translation.rule.Rule;
import java.util.List;

/**
 * Customizable algorithm
 */
public class TranslationEngine {
    
    private List<Rule> rules;
    
    /**
     * Create a translation engine ready for the parameters entered
     */
    public TranslationEngine(List<Rule> rules) {
        this.rules = rules;
    }
    
    /**
     * return the translation result for this.value
     */   
    public String compute(String value) {
        String result = computeRules(value);
        if (result.isEmpty()) {
            return value;
        }
        
        return result;
    }
    
    private String computeRules(String value) {
        StringBuilder result = new StringBuilder();
        for (Rule rule : rules) {
            result.append(rule.translate(value));
        }
        return result.toString();
    }
}
