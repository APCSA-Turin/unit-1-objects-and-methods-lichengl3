public class CircleRunner {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle.getInfo());

        circle.setRadius(9.2);
        System.out.println(circle.getInfo());
    }
}
