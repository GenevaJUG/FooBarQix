/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebdev.foobarqix.rule.criteria;

/**
 *
 * @author jempe
 */
class UnknowCriteriaRule extends RuntimeException {

    public UnknowCriteriaRule(int divisor) {
        super("Criteria rule unkwown for divisor " + divisor);
    }
    
}
