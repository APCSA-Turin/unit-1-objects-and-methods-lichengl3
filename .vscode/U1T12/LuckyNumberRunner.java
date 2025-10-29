public class LuckyNumberRunner {
    public static void main(String[] args) {
        LuckyNumbers lottery = new LuckyNumbers();
        String luckyNums = lottery.getLuckyNumbers();
        System.out.println(luckyNums);

        System.out.println(lottery.randomIntegerBetween(1, 25));
    }
}
