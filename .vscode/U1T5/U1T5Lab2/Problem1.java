package U1T5Lab2;
import java.util.Scanner;
public class Problem1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("first test score: ");
        double testScore1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("second test score: ");
        double testScore2 = scan.nextDouble();
        scan.nextLine();
        System.out.println("third test score: ");
        double testScore3 = scan.nextDouble();
        scan.nextLine();
        System.out.println("fourth test score: ");
        double testScore4 = scan.nextDouble();
        scan.nextLine();
        scan.close();

        double average = (testScore1 + testScore2 + testScore3 + testScore4) / 4;
        System.out.println("average: " + average);

        int roundedAverage;
        if (average - (int) average >= 0.5 ) {
            roundedAverage = (int) (average + 0.5);
        } else {
            roundedAverage = (int) average;
        }
        System.out.println("rounded average: " + roundedAverage);
    }
}




