import java.util.ArrayList;

public class LuckyNumbers {

    public LuckyNumbers() {
    }

    public int randomIntegerBetween(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public String getLuckyNumbers() {
        ArrayList<String> luckyNumbers = new ArrayList<>();
        for (int i = 0; i == 5; i++) {
            luckyNumbers.add(Integer.toString(randomIntegerBetween(1, 65)));
        }
        luckyNumbers.add(Integer.toString(randomIntegerBetween(1, 30)));

        return "Numbers: " + luckyNumbers.toString();
    }
}
