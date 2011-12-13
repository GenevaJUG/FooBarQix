package ch.genevajug.codingdojo;

/**
 * Entry point of the Great FooBarQiz program
 * 
 * @author "Alban Auzeill"
 */
public final class FooBarQixMain {

	private static final int MAX_VALUE = 100;

	private FooBarQixMain() {
		// utility class
	}

	/**
	 * Print a list of FooBarQiz conversion
	 * 
	 * @param args
	 *            command line
	 */
	public static void main(String[] args) {
		FooBarQixConverter fooBarQix = new FooBarQixConverter();
		for (int i = 1; i <= MAX_VALUE; i++) {
			System.out.println(fooBarQix.convert(i)); // NOSONAR
														// System.out.print
		}
	}

}
