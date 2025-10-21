package U1T11.U1T11Lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word1 = scan.nextLine();
        System.out.print("Enter another word: ");
        String word2= scan.nextLine();
        scan.close();

        if (word1.length() > word2.length()) {
            System.out.println(word1 + " is longer.");
        }
        else if (word2.length() > word1.length()) {
            System.out.println(word2 + " is longer.");
        }
        else {
            System.out.println("The words are the same length.");
        }

        System.out.println(word1 + " split in half is " + word1.substring(0, word1.length() / 2) + " and " + word1.substring(word1.length() / 2) + ".");
        System.out.println(word2 + " split in half is " + word2.substring(0, word2.length() / 2) + " and " + word2.substring(word2.length() / 2) + ".");

        if (word1.indexOf(word2) != -1) {
            System.out.println(word2 + " is found in " + word1 + " at index " + word1.indexOf(word2) + ".");
        }
        else {
            System.out.println(word1 + " is not in " + word2 + ".");
        }
    }
}
