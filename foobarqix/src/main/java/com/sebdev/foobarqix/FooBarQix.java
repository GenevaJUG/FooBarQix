package com.sebdev.foobarqix;

public class FooBarQix {

    private final String value;

    public FooBarQix(String value) {
        this.value = value;
    }

    public String compute() {
        try {
            int intValue = Integer.valueOf(this.value);
            return computeFooBarQix(intValue);
        } catch (NumberFormatException ex) {
            return this.value;
        }
    }

    private String computeFooBarQix(int intValue) {
        String result = "";

        FooBarQixEnum[] fooBars = FooBarQixEnum.values();

        for (int i = 0; i < fooBars.length; i++) {
            FooBarQixEnum fooBar = fooBars[i];
            if (isFooBarQixMultiple(intValue, fooBar)) {
                result += fooBars[i].getResult();
            }
        }

        for (int j = 0; j < value.length(); j++) {
            char car = value.charAt(j);
            for (int k = 0; k < fooBars.length; k++) {
                FooBarQixEnum fooBar = fooBars[k];
                if (isFooBarQixContent(car, fooBar)) {
                    result += fooBars[k].getResult();
                }
            }
        }

        if (result.isEmpty()) {
            return this.value;
        }

        return result;
    }

    private boolean isFooBarQixContent(char car, FooBarQixEnum fooBar) {
        return car == fooBar.getDivisorChar();
    }

    private boolean isFooBarQixMultiple(int intValue, FooBarQixEnum fooBar) {
        return intValue % fooBar.getDivisor() == 0;
    }
}
