package U1T4;

import java.util.Scanner;
public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String name = scan.nextLine();
        System.out.println("Welcome, " + name);
        System.out.print("Please enter an integer: ");
        int int1 = scan.nextInt();
        System.out.print("Please enter another integer: ");
        int int2 = scan.nextInt();
        System.out.print("Please enter the third integer: ");
        int int3 = scan.nextInt();
        double average = (int1+int2+int3)/3.0 ;
        System.out.println("The average of " + int1 + " " + int2 + " " +  int3 + " is " + average);
        scan.close();
        }
}
