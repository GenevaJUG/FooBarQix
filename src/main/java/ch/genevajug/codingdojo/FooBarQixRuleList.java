/*
 * Compact Language - Copyright (C) 2011 GNU Lesser General Public License version 3
 */

package ch.genevajug.codingdojo;

import java.util.ArrayList;
import java.util.List;

/**
 * Define all the FooBarQix rules
 * 
 * @author "Alban Auzeill"
 */
public class FooBarQixRuleList extends ArrayList<ConversionRule> {

	private static final long serialVersionUID = 1270277778345669356L;

	public FooBarQixRuleList() {
		appendDivisibleRules();
		appendContainRules();
		appendDefaultRule();
	}

	private void appendDivisibleRules() {
		for (SpecialCase specialCase : SpecialCase.values()) {
			add(new DivisibleRule(specialCase));
		}
	}

	private void appendContainRules() {
		List<MatchRule> matchRules = new ArrayList<MatchRule>();
		for (SpecialCase specialCase : SpecialCase.values()) {
			matchRules.add(new MatchRule(specialCase));
		}
		add(new ContainRule(matchRules));
	}

	private void appendDefaultRule() {
		add(new DefaultRule());
	}

}
