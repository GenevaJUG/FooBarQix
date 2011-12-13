package ch.genevajug.codingdojo;

/**
 * Used to convert a numeric value to a String value according to one FooBarQix
 * rule
 * 
 * @author "Alban Auzeill"
 */
public interface ConversionRule {

	/**
	 * Apply one FooBarQix rule on an int
	 * 
	 * @param out
	 *            the StringBuilder that will receive the result
	 * @param value
	 *            the value to convert
	 */
	void apply(StringBuilder out, int value);

}
