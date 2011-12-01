/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebdev.foobarqix.rule.criteria;

/**
 *
 * @author jempe
 */
public abstract class AbstractCriteria {

    public abstract boolean isDivisible(String value);

    protected int[] parseStringToIntArray(String value) {

        int[] intTab = new int[value.length()];
        for (int index = 0; index < value.length(); index++) {
            int numericValue = Character.getNumericValue(value.charAt(index));
            if (numericValue < 0) {
                throw new CriteriaVeryBigIntegerFormatException(value);
            }
            intTab[index] = numericValue;
        }
        return intTab;
    }
}
