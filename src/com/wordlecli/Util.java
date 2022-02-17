package com.wordlecli;

import java.util.List;

enum ColorMode {
    GREEN, YELLOW, GRAY
}

public class Util {

    public static String getRandomProgrammingLanguage() {
        ProgrammingLanguage[] languages = ProgrammingLanguage.values();
        int total = languages.length;
        int randomIndex = (int) Math.floor(Math.random() * total);

        return languages[randomIndex].toString();
    }

    public static void colorizeSolution(String input, String solution) {
        String[] inputChars = input.toUpperCase().split("");
        String[] solutionChars = solution.toUpperCase().split("");

        for (int i = 0; i < input.length(); i++) {
            if (inputChars[i].equals(solutionChars[i])) {
                colorLog(ColorMode.GREEN, inputChars[i]);
            } else if (solution.toUpperCase().contains(inputChars[i])) {
                colorLog(ColorMode.YELLOW, inputChars[i]);
            } else {
                colorLog(ColorMode.GRAY, inputChars[i]);
            }

            System.out.print(" ");
        }

        System.out.println();
    }

    public static void colorLog(ColorMode mode, String message) {
        switch (mode) {
            case GRAY -> {
                System.out.print(Color.BLACK_BACKGROUND_BRIGHT);
                System.out.print(Color.WHITE_BOLD_BRIGHT);
                System.out.print(" "+message+" ");
            }
            case GREEN -> {
                System.out.print(Color.GREEN_BACKGROUND);
                System.out.print(Color.WHITE_BOLD_BRIGHT);
                System.out.print(" "+message+" ");
            }
            case YELLOW -> {
                System.out.print(Color.YELLOW_BACKGROUND);
                System.out.print(Color.WHITE_BOLD_BRIGHT);
                System.out.print(" "+message+" ");
            }
        }

        System.out.print(Color.RESET);
    }
}
