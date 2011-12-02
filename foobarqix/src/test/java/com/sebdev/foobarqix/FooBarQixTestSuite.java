/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sebdev.foobarqix;

import com.sebdev.foobarqix.math.VeryBigIntegerUtilsTest;
import com.sebdev.foobarqix.rule.RuleTestSuite;
import com.sebdev.foobarqix.rule.criteria.CriteriaTestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author jempe
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    FooBarQixEngineTest.class,
    VeryBigIntegerUtilsTest.class,
    RuleTestSuite.class,
    CriteriaTestSuite.class})
public class FooBarQixTestSuite {
    
}
