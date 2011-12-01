package com.sebdev.foobarqix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Runner {

    public static final String EXIT_CHAR = "q";

    public static void main(String[] args) throws Exception {
        String userInput = null;
        while (!EXIT_CHAR.equals(userInput)) {
            System.out.print("Veuillez saisir une valeur (q pour sortir):");
            userInput = inputString();
            FooBarQix barQix = new FooBarQix(userInput);
            System.out.println(barQix.compute());
        }
    }

    public static String inputString() throws IOException {
        BufferedReader inr = new BufferedReader(new InputStreamReader(System.in));
        return (inr.readLine());
    }
}
