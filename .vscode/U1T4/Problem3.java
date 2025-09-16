package U1T4;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose an integer between 100 and 999: ");
        int number = scan.nextInt();
        scan.nextLine();
        scan.close();
        
        int lastNumber = number / 100 ;
        int middleNumber = (number - (lastNumber * 100)) / 10 ;
        int firstNumber = number - (lastNumber * 100 + middleNumber * 10);

        System.out.print("The reverse of " + number + " is: " + firstNumber + middleNumber + lastNumber);
    }
}
