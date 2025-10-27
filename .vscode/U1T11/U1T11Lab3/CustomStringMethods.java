package U1T11.U1T11Lab3;

public class CustomStringMethods {
    
    public CustomStringMethods() { }

    public boolean longerThan(String myString, int maxLength) {
        if (myString.length() < maxLength) {
            return false;
        }
        return true;
    }
}

public String funnyString(String str, int idx)
