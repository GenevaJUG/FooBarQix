package ch.genevajug.codingdojo;

/**
 * @author "Alban Auzeill"
 */
public enum SpecialCase {

	Foo(3), Bar(5), Qix(7);

	private final int intValue;
	private final char charValue;

	private SpecialCase(int intValue) {
		this.intValue = intValue;
		this.charValue = (char) ('0' + intValue);
	}

	public int getIntValue() {
		return intValue;
	}

	public char getCharValue() {
		return charValue;
	}

}
