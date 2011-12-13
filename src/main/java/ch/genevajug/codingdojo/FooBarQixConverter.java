package ch.genevajug.codingdojo;

import java.util.ArrayList;
import java.util.List;

/**
 * A converter that apply the FooBarQiz rules to convert a number into a string
 * 
 * @author "Alban Auzeill"
 */
public class FooBarQixConverter {

	private static final List<MatchRule> MATCH_RULES = new ArrayList<MatchRule>();
	static {
		for (SpecialCase specialCase : SpecialCase.values()) {
			MATCH_RULES.add(new MatchRule(specialCase));
		}
	}

	private static final List<ConversionRule> RULES = new ArrayList<ConversionRule>();
	static {
		for (SpecialCase specialCase : SpecialCase.values()) {
			RULES.add(new DivisibleRule(specialCase));
		}
		RULES.add(new ContainRule(MATCH_RULES));
		RULES.add(new DefaultRule());
	}

	/**
	 * Convert value into the FooBarQiz representation
	 * 
	 * @param value
	 *            the number to convert
	 * @return the string representation
	 */
	public String convert(int value) {
		StringBuilder sb = new StringBuilder();
		for (ConversionRule rule : RULES) {
			rule.apply(sb, value);
		}
		return sb.toString();
	}

}
