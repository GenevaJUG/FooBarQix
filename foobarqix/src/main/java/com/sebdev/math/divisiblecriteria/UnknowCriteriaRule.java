package com.sebdev.math.divisiblecriteria;

public class UnknowCriteriaRule extends RuntimeException {

    public UnknowCriteriaRule(int divisor) {
        super("Criteria rule unkwown for divisor " + divisor);
    }
}
