package U1T5Lab2;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number: ");
        double number = scan.nextDouble();
        scan.nextLine();
        double adjustedNumber = 100*number; //turns the value in variable "number" to a 5 digit number
        int firstDigit =  (int) (adjustedNumber % 10);
        int secondDigit =  (int) ((adjustedNumber % 100) - firstDigit) / 10;
        int thirdDigit = (int) ((adjustedNumber % 1000) - firstDigit - secondDigit) / 100;
        int fourthDigit = (int) ((adjustedNumber % 10000) - firstDigit - secondDigit - thirdDigit) / 1000;
        int fifthDigit = (int) ((adjustedNumber) - firstDigit - secondDigit * 10 - thirdDigit * 100 - fourthDigit * 1000) / 10000;
        fifthDigit ++;
        if (fifthDigit == 10) {
            fifthDigit = 0;
        }
        fourthDigit ++;
        if (fourthDigit == 10) {
            fourthDigit = 0;
        }
        thirdDigit ++;
        if (thirdDigit == 10) {
            thirdDigit = 0;
        }
        secondDigit ++;
        if (secondDigit == 10) {
            secondDigit = 0;
        }
        firstDigit ++;
        if (firstDigit == 10) {
            firstDigit = 0;
        }


        System.out.println("Adjusted Number: " + fifthDigit + fourthDigit + thirdDigit + "." + secondDigit + firstDigit);
        scan.close();
    }
}

