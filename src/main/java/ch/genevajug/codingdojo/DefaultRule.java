package ch.genevajug.codingdojo;

/**
 * @author "Alban Auzeill"
 */
public class DefaultRule implements ConversionRule {

	public void apply(StringBuilder out, int value) {
		if (out.length() == 0) {
			out.append(Integer.toString(value));
		}
	}

}
