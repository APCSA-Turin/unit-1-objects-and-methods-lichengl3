public class Receipt {
    public static void main(String[] args) {
        String customerName = "Stacey" ;
        int apples = 12 ;
        int pineapples = 2 ;
        int rice = 3 ;
        int itemNumber = apples + pineapples + rice ;
        double totalCost = 12.0 * apples + 3.59 * pineapples + 4.409245 * 1.39 * 3 ;
        double averageCost = totalCost / itemNumber ;
        int cashTendered = 40 ;
        double changeRecieved = 40 - totalCost ;

        System.out.println("Customer Name: " + customerName);
        System.out.println("Number of Items: " + itemNumber);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Average Cost: " + averageCost);
        System.out.println(" ");
        System.out.println("Cash Tendered: " + cashTendered);
        System.out.println("Change Recieved: " + changeRecieved);
    }
}
