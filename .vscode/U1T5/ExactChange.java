package U1T5;
import java.util.Scanner;

public class ExactChange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an amount of money in USD: ");
        double dollars = scan.nextDouble();
        scan.nextLine();
        scan.close();

        int cents = (int) (dollars * 100);
        int quarters = cents / 25;
        int dimes = (cents - quarters * 25) / 10;
        int nickels = (cents - quarters * 25 - dimes * 10) / 5;
        int pennies = (cents - quarters * 25 - dimes * 10 - nickels * 5);
        int totalCoins = quarters + dimes + nickels + pennies;

        System.out.println("The mininum amount of coins is " + totalCoins + ".");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}
