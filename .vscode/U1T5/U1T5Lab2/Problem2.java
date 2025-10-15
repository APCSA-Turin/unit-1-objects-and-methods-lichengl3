package U1T5Lab2;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("stock ticker symbol: ");
        scan.nextLine();
        System.out.print("shares: ");
        int shares = scan.nextInt();
        scan.nextLine();
        System.out.print("change in stock price in positive or negative decimals: ");
        double changeStockPrice = scan.nextDouble();
        scan.nextLine();

        double changeStockValue = (changeStockPrice*shares);
        int roundedChangeStockValue;
        if (changeStockValue > 0 ) {
            roundedChangeStockValue = (int) (changeStockValue + 0.5);
        }  else if (changeStockValue == 0) {
                roundedChangeStockValue = (int) changeStockValue;
        }   else {
            roundedChangeStockValue = (int) (changeStockValue - 0.5);
        }
        System.out.println("Change in stock value: $" + roundedChangeStockValue + " dollar");

        scan.close();
    }
}


