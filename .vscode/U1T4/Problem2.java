package U1T4;

import java.util.Scanner;
public class Problem2 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1, enter your name: ");
        String p1Name = scan.nextLine();
        System.out.println("Enter your number: ");
        double p1Num = scan.nextDouble();
        scan.nextLine();
        
        System.out.println("Player 2, enter your name: ");
        String p2Name = scan.nextLine();
        System.out.println("Enter your number: ");
        double p2Num = scan.nextDouble();
        scan.nextLine();

        if (p1Num > p2Num) {
            System.out.println(p1Name + "'s number is bigger!");
        }   else if (p1Num < p2Num) {
            System.out.println(p2Name + "'s number is bigger!");
        }   else {
            System.out.println("The numbers are equal!");

            scan.close();
        }
    }
}
