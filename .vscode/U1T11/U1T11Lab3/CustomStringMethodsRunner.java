package U1T11.U1T11Lab3;

public class CustomStringMethodsRunner {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        System.out.println("longerThan: " + methods.longerThan("HelloWorld", 5));
        System.out.println("funnyString: " + methods.funnyString("cat", 1));
        System.out.println("halvesReversed: " + methods.halvesReversed("abcdef"));
        System.out.println("pigLatin: " + methods.pigLatin("hello"));
        System.out.println("removeCharacter: " + methods.removeCharacter("abcdef", 2));
        System.out.println("insertAt: " + methods.insertAt("I like Java", " really", "Java"));
        System.out.println("endUp: " + methods.endUp("hello", 3));
        System.out.println("yellOrWhisper: " + methods.yellOrWhisper("Hello"));
        System.out.println("yellOrWhisper: " + methods.yellOrWhisper("hello"));
    }
}
