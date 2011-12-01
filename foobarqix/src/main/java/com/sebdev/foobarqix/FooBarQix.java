package com.sebdev.foobarqix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Console IHM for FooBarQix algorithm
 */
public class FooBarQix {

    private static final String EXIT_CHAR = "q";

    /**
     * Usage: 
     *   enter q to exit program
     *   enter any value to display the foobarqix result
     */
    public static void main(String[] args) throws Exception {
        String userInput = null;
        while (!EXIT_CHAR.equals(userInput)) {
            System.out.print("Veuillez saisir une valeur (q pour sortir):");
            userInput = inputString();
            FooBarQixEngine barQix = new FooBarQixEngine(userInput);
            System.out.println(barQix.compute());
        }
    }

    private static String inputString() throws IOException {
        BufferedReader inr = new BufferedReader(new InputStreamReader(System.in));
        return (inr.readLine());
    }
}
