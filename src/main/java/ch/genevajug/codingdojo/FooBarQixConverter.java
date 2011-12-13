package ch.genevajug.codingdojo;

import java.util.ArrayList;
import java.util.List;

/**
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
	 * @param intValue
	 *            the number to convert
	 * @return the foo bar qix representation of this number
	 */
	public String convert(int value) {
		StringBuilder sb = new StringBuilder();
		for (ConversionRule rule : RULES) {
			rule.apply(sb, value);
		}
		return sb.toString();
	}

}
