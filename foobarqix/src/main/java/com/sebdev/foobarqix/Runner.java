package com.sebdev.foobarqix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Main du programme FooBarQix
 */
public class Runner {

    private static final String EXIT_CHAR = "q";
    private static final String WRITE_0_100 = "list";

    /**
     * Usage: 
     *   enter q to exit program
     *   enter list to writer foobarqix for numbers 1 to 100
     *   enter any value to display the foobarqix result
     */
    public static void main(String[] args) throws Exception {
        Runner runner = new Runner();
        runner.execute();
    }

    protected void execute() throws IOException {
        FooBarQix foobarQix = new FooBarQix();
        String userInput = null;
        while (!EXIT_CHAR.equals(userInput)) {
            System.out.print("Veuillez saisir une valeur (list pour 0-100; q pour sortir):");
            userInput = inputString();
            if (hasToBeComputedForNumbers1To100(userInput)) {
                for (int number = 1; number <= 100; number++) {
                    System.out.println(foobarQix.compute(Integer.toString(number)));
                }
            } else {
                System.out.println(foobarQix.compute(userInput));
            }
        }
    }

    protected String inputString() throws IOException {
        BufferedReader inr = new BufferedReader(new InputStreamReader(System.in));
        return (inr.readLine());
    }

    private boolean hasToBeComputedForNumbers1To100(String userInput) {
        return WRITE_0_100.equals(userInput);
    }
}
