package ch.genevajug.codingdojo;

/**
 * DefaultRule is one of the FooBarQuiz rule that simply print the int value as
 * a string if no other rules were valid
 * 
 * 
 * @author "Alban Auzeill"
 */
public class DefaultRule implements ConversionRule {

	public void apply(StringBuilder out, int value) {
		if (out.length() == 0) {
			out.append(Integer.toString(value));
		}
	}

}
