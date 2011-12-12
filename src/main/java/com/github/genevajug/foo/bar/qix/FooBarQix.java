package com.github.genevajug.foo.bar.qix;

import com.github.genevajug.foo.bar.qix.converter.NumberConverter;

public class FooBarQix {

    private static int STARTING_NUMBER = 1;
    private static int ENDING_NUMBER = 100;

    public static void main(String... args) {

        NumberConverter numberConverter = new NumberConverter();

        for (int numberToConvert = STARTING_NUMBER; numberToConvert <= ENDING_NUMBER; numberToConvert++) {
            System.out.println(numberConverter.convert(numberToConvert));
        }

    }
}
