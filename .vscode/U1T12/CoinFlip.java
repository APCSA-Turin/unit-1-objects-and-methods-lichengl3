public class CoinFlip {

    public CoinFlip() {
    }

    public static String flip() {
        if ((int) (Math.random() * 2) + 1 == 1) {
            return "heads";
        }
        return "tails";
    }

    public static double simulate(int attempts) {
        int heads = 0;
        for (int i = 0; i < attempts; i++) {
            if (flip().equals("heads")) {
                heads++;
            }
        }
    return (double) heads / attempts;
    }
}
