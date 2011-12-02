package ch.genevajug.codingdojo;

/**
 * @author "Alban Auzeill"
 */
public class FooBarQixMain {

	public static void main(String[] args) {
		FooBarQixConverter fooBarQix = new FooBarQixConverter();
		for (int i = 1; i <= 100; i++) {
			System.out.println(fooBarQix.convert(i));
		}
	}

}
