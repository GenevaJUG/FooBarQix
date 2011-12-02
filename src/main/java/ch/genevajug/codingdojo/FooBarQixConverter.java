package ch.genevajug.codingdojo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author "Alban Auzeill"
 */
public class FooBarQixConverter {

	private static final List<ConversionRule> RULES = new ArrayList<ConversionRule>();
	static {
		List<MatchRule> matchRules = new ArrayList<MatchRule>();
		for (SpecialCase specialCase : SpecialCase.values()) {
			RULES.add(new DivisibleRule(specialCase));
			matchRules.add(new MatchRule(specialCase));
		}
		RULES.add(new ContainRule(matchRules));
		RULES.add(new DefaultRule());
	}

	/**
	 * @param intValue
	 *            the number to convert
	 * @return the foo bar qix representation of this number
	 */
	public String convert(int intValue) {
		Base10Value value = new Base10Value(intValue);
		StringBuilder sb = new StringBuilder();
		for (ConversionRule rule : RULES) {
			rule.apply(sb, value);
		}
		return sb.toString();
	}

}
