package ch.genevajug.codingdojo;

import java.util.List;

/**
 * A converter that apply the FooBarQix rules to convert a number into a string
 * 
 * @author "Alban Auzeill"
 */
public class FooBarQixConverter {

	private static final List<ConversionRule> RULES = new FooBarQixRuleList();

	/**
	 * Convert value into the FooBarQix representation
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
