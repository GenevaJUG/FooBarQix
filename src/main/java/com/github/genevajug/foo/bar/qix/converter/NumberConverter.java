package com.github.genevajug.foo.bar.qix.converter;

public class NumberConverter {

    private static final String NUMBER_3_CONVERTED = "Foo";
    private static final String NUMBER_5_CONVERTED = "Bar";
    private static final String NUMBER_7_CONVERTED = "Qix";

    
    public String convert(int numberToConvert) {
        StringBuilder result = new StringBuilder();
        result.append(divisionLookup(numberToConvert));

        String entry = String.valueOf(numberToConvert);
        for (char character : entry.toCharArray()) {
            result.append(numberLookup(character));
        }

        return result.toString().isEmpty() ? entry : result.toString();
    }

    private String divisionLookup(Integer value) {
        StringBuilder result = new StringBuilder();
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
    
    private String numberLookup(char value) {
        StringBuilder result = new StringBuilder();
        if (value == '3') {
            result.append(NUMBER_3_CONVERTED);
        }
        if (value == '5') {
            result.append(NUMBER_5_CONVERTED);
        }
        if (value == '7') {
            result.append(NUMBER_7_CONVERTED);
        }
        return result.toString();
    }
}
