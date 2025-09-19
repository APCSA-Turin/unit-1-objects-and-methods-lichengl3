package U1T5Lab2;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("stock ticker symbol: ");
        scan.nextLine();
        System.out.println("shares: ");
        int shares = scan.nextInt();
        scan.nextLine();
        System.out.println("change in stock price in positive or negative decimals: ");
        double changeStockPrice = scan.nextDouble();
        scan.nextLine();

        double changeStockValue = (changeStockPrice*shares);
        int roundedChangeStockValue;
        if (changeStockValue - (int) changeStockValue >= 0.5 ) {
            roundedChangeStockValue = (int) (changeStockValue + 0.5);
        } else {
            roundedChangeStockValue = (int) changeStockValue;
        }
        System.out.println("Change in stock value: $" + roundedChangeStockValue + " dollar");

        scan.close();
    }
}


