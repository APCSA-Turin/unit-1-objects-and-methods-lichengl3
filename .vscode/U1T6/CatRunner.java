public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("John", 5, 5);
        cat1.printCatInfo();
        cat1.introduce();

        Cat cat2 = new Cat("Bob", 3, 3);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
