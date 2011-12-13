package ch.genevajug.codingdojo;

/**
 * DivisibleRule write a replacement string to the output if the value can be
 * divided by the given denominator
 * 
 * @author "Alban Auzeill"
 */
public class DivisibleRule implements ConversionRule {
	private final int denominator;
	private final String replacement;

	/**
	 * Construct the rule by passing a SpecialCase where the value will be the
	 * denominator and the name the replacement string
	 * 
	 * @param specialCase
	 */
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
