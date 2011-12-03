package ch.bznmith;

import java.util.HashMap;
import java.util.Map;

/**
 * Represent the interesting values and their replacement strings
 * @see <a href="http://www.code-story.net/2011/11/16/foobarqix.html">Code Story</a>
 * @author bzn
 * @author mith
 */
public enum FBQValues {

	Foo(3), Bar(5), Qix(7);

	private final int value;

	// Ugly hack for reverse mapping
	private static final Map<Integer, FBQValues> _mappedValues = new HashMap<Integer, FBQValues>();
	static {
		for(FBQValues enumValue: values()) {
			_mappedValues.put(enumValue.value, enumValue);
		}
	}

	private FBQValues(int value) {
		this.value = value;
	}

	
	/**
	 * Replace the given integer with its specified replacement string, if its string representation
	 * matches one of the interesting values
	 * @param toReplace
	 * @return
	 */
	public static String replaceCharacter(int toReplace) {
		String result = "";
		if(_mappedValues.containsKey(toReplace)) {
			result = _mappedValues.get(toReplace).name();
		}
		return result;
	}

	/**
	 * @param input
	 * @return the enum's name if input is divisible by the associated enum value
	 */
	public String replaceDivisible(int input) {
		String result = "";
		if(input % this.value == 0) {
			result = this.name();
		}
		return result;
	}
}
