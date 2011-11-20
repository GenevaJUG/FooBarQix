package com.github.genevajug.foo.bar.qix.converter;

public class NumberConverter {

    private static final String NUMBER_3_CONVERTED = "Foo";
    private static final String NUMBER_5_CONVERTED = "Bar";
    private static final String NUMBER_7_CONVERTED = "Qix";

    
    public String convert(int numberToConvert) {
        StringBuilder result = new StringBuilder();
        result. //
            append(divisionLookup(numberToConvert));
        String entry = String.valueOf(numberToConvert);
        for (char character : entry.toCharArray()) {
            Integer value = Integer.valueOf(String.valueOf(character));
            result.//
                append(numberLookup(value));
        }

        return result.toString().isEmpty() ? entry : result.toString();
    }

    private String divisionLookup(Integer value) {
        StringBuffer result = new StringBuffer();
        if (value % 3 == 0) {
            result.append(NUMBER_3_CONVERTED);
        }
        if (value % 5 == 0) {
            result.append(NUMBER_5_CONVERTED);
        }
        if (value % 7 == 0) {
            result.append(NUMBER_7_CONVERTED);
        }
        return result.toString();
    }
    
    private String numberLookup(Integer value) {
        StringBuffer result = new StringBuffer();
        if (value == 3) {
            result.append(NUMBER_3_CONVERTED);
        }
        if (value == 5) {
            result.append(NUMBER_5_CONVERTED);
        }
        if (value == 7) {
            result.append(NUMBER_7_CONVERTED);
        }
        return result.toString();
    }
}
