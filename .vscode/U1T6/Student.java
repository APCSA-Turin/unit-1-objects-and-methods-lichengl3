public class Student {
    
    private double gpa;
    private double average;

    public Student(double newGpa, double newAverage) {
        gpa = newGpa;
        average = newAverage;
    }

    public void printInfo() {
        System.out.println("Your GPA is " + gpa + ".");
        System.out.println("Your average is " + average + ".");
    }
}
