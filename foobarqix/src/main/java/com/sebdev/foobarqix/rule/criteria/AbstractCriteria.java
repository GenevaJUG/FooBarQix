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

    protected int[] parseStringToIntArrayold(String value) {

        int[] intTab = new int[value.length()];
        for (int index = value.length() - 1; index >= 0; index++) {
            try {
                intTab[index] = Integer.parseInt(value.substring(index, index - 1));
            } catch (NumberFormatException ex) {
                throw new CriteriaVeryBigIntegerFormatException(value, ex);
            }
        }
        return intTab;
    }

    protected int[] parseStringToIntArray(String value, int lenght) {
        int temp = value.length() % lenght;
        int tttt = value.length() / lenght;
        if (temp != 0) {
            tttt++;
        }
        int[] intTab = new int[tttt];
        int beginIndex = 0;
        int endIndex = (temp == 0 ? lenght : temp);
        for (int index = 0; index < intTab.length; index++) {
            try {
                intTab[index] = Integer.parseInt(value.substring(beginIndex, endIndex));
            } catch (NumberFormatException ex) {
                throw new CriteriaVeryBigIntegerFormatException(value, ex);
            }
            beginIndex = endIndex;
            endIndex = endIndex + lenght;
        }

        return intTab;
    }
}
