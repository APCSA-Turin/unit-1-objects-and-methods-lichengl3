package U1T11.U1T11Lab2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;

        System.out.print("Enter a word: ");
        String initalWord = scan.nextLine();

        while (score <= 50) {
            System.out.print("Enter another word: ");
            String word = scan.nextLine();

            if (initalWord.compareTo(word) > 0) {
                System.out.println(word + " is ahead of " + initalWord + " alphabetically. Two points awarded.");
                score += 2;
            }

            if (initalWord.compareTo(word) <= 0) {
                System.out.println(word + " is behind of " + initalWord + " alphabetically. Five points deducted.");
                score -= 5;
            }

            if (initalWord.compareTo(word) == 0) {
                System.out.println(word + " is the same as " + initalWord + ". Ten points deducted.");
                score -= 10;
            }

            System.out.println("");
            System.out.println("Score: " + score);
        }
        scan.close();
    }
}
