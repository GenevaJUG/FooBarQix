package com.sebdev;

import com.sebdev.foobarqix.FooBarQixTest;
import com.sebdev.translation.TranslationEngineTest;
import com.sebdev.math.VeryBigIntegerTest;
import com.sebdev.translation.rule.RuleTestSuite;
import com.sebdev.math.divisiblecriteria.DivisbleCriteriaTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    FooBarQixTest.class,
    TranslationEngineTest.class,
    TranslationEngineTest.class,
    VeryBigIntegerTest.class,
    RuleTestSuite.class,
    DivisbleCriteriaTestSuite.class})
public class TotalTestSuite {
    
}
