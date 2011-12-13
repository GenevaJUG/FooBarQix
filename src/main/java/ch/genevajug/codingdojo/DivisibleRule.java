package ch.genevajug.codingdojo;

/**
 * @author "Alban Auzeill"
 */
public class DivisibleRule implements ConversionRule {
	private final int denominator;
	private final String replacement;

	public DivisibleRule(SpecialCase specialCase) {
		this.denominator = specialCase.getIntValue();
		this.replacement = specialCase.name();
	}

	public void apply(StringBuilder out, int value) {
		if (value % denominator == 0) {
			out.append(replacement);
		}
	}
}
