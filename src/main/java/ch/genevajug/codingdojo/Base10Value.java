package ch.genevajug.codingdojo;

/**
 * @author "Alban Auzeill"
 */
public class Base10Value {
	private final int intValue;
	private final String base10Value;

	public Base10Value(int intValue) {
		this.intValue = intValue;
		this.base10Value = Integer.toString(intValue);
	}

	public int getValue() {
		return intValue;
	}

	public String toString() {
		return base10Value;
	}

}
