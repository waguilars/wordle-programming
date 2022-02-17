package com.wordlecli;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String solution = Util.getRandomProgrammingLanguage();
        Scanner sc = new Scanner(System.in);

        String language;
        do {
            System.out.println("\uD83E\uDD14 Let's try to guess a programming language!");
            System.out.print("The language is... ");
            language = sc.nextLine();

            if (!solution.equalsIgnoreCase(language) && solution.length() != language.length()) {
                System.out.println("The solution has " + solution.length() + " characters. Try again!");
                continue;
            }

            Util.colorizeSolution(language, solution);
        } while (!solution.equalsIgnoreCase(language));

        System.out.println("\uD83C\uDF89 You won!");
    }
}
