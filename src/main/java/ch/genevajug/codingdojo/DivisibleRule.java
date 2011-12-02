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

	public void apply(StringBuilder out, Base10Value value) {
		if (value.getValue() % denominator == 0) {
			out.append(replacement);
		}
	}
}
