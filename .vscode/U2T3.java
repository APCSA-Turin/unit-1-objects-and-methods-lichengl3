public class U2T3 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        x = y;
        y = 20;
        int z = x + y;
        x = 7;
        System.out.println("x: " + x + ", y: " + y + " ,z: " + z);
    }
}
