package ch.bznmith;

/**
 * 
 * @author bzn <benzonico@gmail.com>
 * @author mith <mithfindel@gmail.com>
 */
public class FooBarQix {

	
	/**
	 * Convert the given integer as specified by the contest page
	 * @see <a href="http://www.code-story.net/2011/11/16/foobarqix.html">Code Story</a>
	 * @param input the integer to convert
	 * @return a string representation compliant with the specs
	 */
	public String convert(int input) {

		String result = "";

		for(FBQValues enumValue: FBQValues.values()) {
			result += enumValue.replaceDivisible(input);
		}

		result += replaceCharacters(input);

		if("".equals(result)) {
			result = Integer.toString(input);
		}

		return result;
	}

	/**
	 * Replace each character of the string representation of <code>input</code>
	 * with the matching FBQ value
	 * @param input the integer to handle
	 * @return the replaced values (empty if nothing matches)
	 */
	private String replaceCharacters(int input) {
		String result = "";
		for(char inputCharacter: Integer.toString(input).toCharArray()) {
			result += FBQValues.replaceCharacter(
				Integer.valueOf(
					Character.digit(inputCharacter, 10)
				)
			);
		}
		return result;
	}

	public static void main(String[] args) {
		FooBarQix fbq = new FooBarQix();
		for(int input = 0; input <= 100; input ++) {
			System.out.println(fbq.convert(input));
		}
	}
}
