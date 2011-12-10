public class FooBarQixGenerator {

	private static final String QIX = "Qix";
	private static final String BAR = "Bar";
	private static final String FOO = "Foo";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final FooBarQixGenerator fbq = new FooBarQixGenerator();
		for(int i=1;i<=100;i++){
			System.out.println(fbq.valueOf(i));
		}

	}
	
	public String valueOf(int number) {
		final StringBuilder retour = new StringBuilder();
		if (number % 3 == 0) {
			retour.append(FOO);
		}
		if (number % 5 == 0) {
			retour.append(BAR);
		}
		if (number % 7 == 0) {
			retour.append(QIX);
		}
		final String numberStr = Integer.toString(number).replaceAll("[^357]", "");
		retour.append(numberStr.replaceAll("3", FOO).replaceAll("5", BAR).replaceAll("7", QIX));
		if (retour.length() == 0) {
			retour.append(Integer.toString(number));
		}
		return retour.toString();
	}

}
