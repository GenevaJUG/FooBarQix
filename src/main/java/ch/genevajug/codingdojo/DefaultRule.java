package ch.genevajug.codingdojo;

/**
 * @author "Alban Auzeill"
 */
public class DefaultRule implements ConversionRule {

	public void apply(StringBuilder out, Base10Value value) {
		if (out.length() == 0) {
			out.append(value.toString());
		}
	}

}
