package ch.genevajug.codingdojo;

/**
 * @author "Alban Auzeill"
 */
public class MatchRule {
	private final char expected;
	private final String replacement;

	public MatchRule(SpecialCase specialCase) {
		this.expected = specialCase.getCharValue();
		this.replacement = specialCase.name();
	}

	public void apply(StringBuilder sb, char value) {
		if (value == expected) {
			sb.append(replacement);
		}
	}
}
