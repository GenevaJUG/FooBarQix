package ch.genevajug.codingdojo;

import java.util.List;

/**
 * @author "Alban Auzeill"
 */
public class ContainRule implements ConversionRule {

	private final List<MatchRule> subRules;

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
