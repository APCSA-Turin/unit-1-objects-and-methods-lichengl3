package U1T6Lab2;


public class Circle {
    private double radius;
    
    public Circle(double newRadius) {
        radius = newRadius;
    }
    public void printArea() {
        System.out.println("The area of the circle is " + radius * radius * Math.PI);
    }
}

