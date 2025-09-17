package U1T4;
import java.util.Scanner;

public class U1T4Lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter a rational number: ");
        double number = scan.nextDouble();
        scan.nextLine();
        scan.close();

        if (number < 0) {
                number *= 5 ;
                number += 9.8;
        }   else if (number > 0) {
                number /= 5;
                number --;
        }   else {
            number++;
            number %= number;
        }
        System.out.println(name + ", your number is " + number + ".");
    }
}
