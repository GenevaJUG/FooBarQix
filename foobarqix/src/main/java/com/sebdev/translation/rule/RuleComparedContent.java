package com.sebdev.translation.rule;

import java.util.HashMap;
import java.util.Map;

/**
 * Rule used to search if a value match a character
 */
public class RuleComparedContent implements Rule {

    private Map<Character, String> translations;

    /**
     * Prepare the rule for a character to evaluate
     */
    public RuleComparedContent(int[] charsToMatch, String[] translationsValue) {
        this.translations = new HashMap<Character, String>();
        for (int i = 0; i < charsToMatch.length; i++) {
            translations.put(Integer.toString(charsToMatch[i]).charAt(0), translationsValue[i]);
        }
    }

    /**
     * return a String of translationsValues for all matches found with charsToMatch
     */
    @Override
    public String translate(String value) {
        StringBuilder result = new StringBuilder();
        for (int j = 0; j < value.length(); j++) {
            char character = value.charAt(j);
            if (translations.containsKey(character)) {
                result.append(translations.get(character));
            }
        }
        return result.toString();
    }
}
