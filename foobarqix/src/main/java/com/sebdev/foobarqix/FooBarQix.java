package com.sebdev.foobarqix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FooBarQix {

    private final String value;

    public FooBarQix(String value) {
        this.value = value;
    }

    public static String inputString() throws IOException {
        BufferedReader inr = new BufferedReader(new InputStreamReader(System.in));
        return (inr.readLine());
    }

    public static void main(String[] args) throws IOException {

        try {
            System.out.print("Veuillez saisir une valeur:");
            String userInput = FooBarQix.inputString();
            FooBarQix barQix = new FooBarQix(userInput);
            System.out.println(barQix.getresult());
        } catch (IOException ex) {
            Logger.getLogger(FooBarQix.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getresult() {
        try {
            int intValue = Integer.valueOf(this.value);
            return getTransformedResult(intValue);
        } catch (NumberFormatException ex) {
            return this.value;
        }
    }

    private String getTransformedResult(int intValue) {
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
