package ch.genevajug;

public class FooBarQix {

	static public final String FOO = "Foo";
	static public final String BAR = "Bar";
	static public final String QIX = "Qix";
	
	/**
	 * Calcule la chaîne basée sur la règle du jeu.
	 * <p>
	 *   <ul>
	 *		<li>Si le nombre est divisible par 3 ou contient 3, écrire "Foo" à la place de 3.</li>
     *		<li>Si le nombre est divisible par 5 ou contient 5, écrire "Bar" à la place de 5.</li>
     *		<li>Si le nombre est divisible par 7 ou contient 7, écrire "Qix" à la place de 7.</li>
	 *   </ul>
	 * </p>
	 * 
	 * @param i le nombre à calculer
	 * @return la chaîne correspondante.
	 * 
	 */
	public String compute( int i ){
		StringBuffer buf = new StringBuffer();
		if (i % 3 == 0) buf.append( FOO );
		if (i % 5 == 0) buf.append( BAR );
		if (i % 7 == 0) buf.append( QIX );
		
		String str = String.valueOf(i);
		if (str.indexOf("3") >= 0) buf.append( FOO );
		if (str.indexOf("5") >= 0) buf.append( BAR );
		if (str.indexOf("7") >= 0) buf.append( QIX );
		
		return (buf.length() > 0 ? buf.toString() : str);
	}
	
	/**
	 * Simply run this to have your FooBarQix...
	 * 
	 * @param No arguments expected.
	 */
	public static void main(String[] args) {
		FooBarQix fbq = new FooBarQix();
		for(int i = 1; i <= 100; i++ ){
			System.out.println( fbq.compute( i ) );
		}
	}

}
