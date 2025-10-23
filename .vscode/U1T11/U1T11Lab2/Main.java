package U1T11.U1T11Lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        int attempts = 0;

        System.out.print("Enter a word: ");
        String initialWord = scan.nextLine().toLowerCase();
        String previousWord = initialWord;

        while (score <= 50) {
            System.out.print("Enter another word: ");
            String word = scan.nextLine().toLowerCase();

            if (previousWord.compareTo(word) < 0) {
                System.out.println(word + " is ahead of " + initialWord + " alphabetically. Two points awarded.");
                score += 2;
            }

            if (previousWord.compareTo(word) > 0) {
                System.out.println(word + " is behind of " + initialWord + " alphabetically. Five points deducted.");
                score -= 5;
            }

            if (previousWord.compareTo(word) == 0) {
                System.out.println(word + " is the same as " + initialWord + ". Ten points deducted.");
                score -= 10;
            }

            try {
                if ((previousWord.substring((previousWord.length() - 2), previousWord.length()))
                        .equals((word.substring(0, 2)))) {
                    System.out.println("\"" + previousWord.substring((previousWord.length() - 2), previousWord.length())
                            + "\" at the start of " + previousWord + " is the same as \""
                            + word.substring(0, 2) + "\" in " + word + ". Five points awarded.");
                    score += 5;
                }
            } catch (StringIndexOutOfBoundsException e) {
                score += 0;
            }

            if (word.indexOf(previousWord.charAt(0)) >= 0) {
                System.out.println("\"" + previousWord.charAt(0) + "\", the first letter in " + previousWord
                        + ", was found in " + word + ". Three points awarded.");
                score += 3;
            }

            System.out.println("");
            System.out.println("Score: " + score);
            attempts++;
            previousWord = word;
            System.out.println("");
        }
        System.out.println("It took you " + attempts + " attempts to reach over 50 points.");
        scan.close();
    }
}
