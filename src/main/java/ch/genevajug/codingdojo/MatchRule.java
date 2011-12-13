package ch.genevajug.codingdojo;

/**
 * MatchRule write a replacement string to the output if the character value
 * match an expected one
 * 
 * @author "Alban Auzeill"
 */
public class MatchRule {
	private final char expected;
	private final String replacement;

	/**
	 * Construct the rule by passing a SpecialCase where the value will be the
	 * expected character and the name the replacement string
	 * 
	 * @param specialCase
	 */
	public MatchRule(SpecialCase specialCase) {
		this.expected = specialCase.getCharValue();
		this.replacement = specialCase.name();
	}

	/**
	 * Apply one FooBarQiz rule on a character
	 * 
	 * @param out
	 *            the StringBuilder that will receive the result
	 * @param value
	 *            the value to convert
	 */
	public void apply(StringBuilder sb, char value) {
		if (value == expected) {
			sb.append(replacement);
		}
	}
}
