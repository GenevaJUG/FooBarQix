package ch.genevajug.codingdojo;

import java.util.List;

/**
 * ContainRule apply a list of rule on the each character of the string
 * representation of a value
 * 
 * @author "Alban Auzeill"
 */
public class ContainRule implements ConversionRule {

	private final List<MatchRule> subRules;

	/**
	 * Constructs a ContainRule ready to apply the given list of rules
	 * 
	 * @param subRules
	 *            rules to apply
	 */
	public ContainRule(List<MatchRule> subRules) {
		this.subRules = subRules;
	}

	public void apply(StringBuilder out, int value) {
		for (char ch : Integer.toString(value).toCharArray()) {
			apply(out, ch);
		}
	}

	private void apply(StringBuilder out, char ch) {
		for (MatchRule rule : subRules) {
			rule.apply(out, ch);
		}
	}

}
