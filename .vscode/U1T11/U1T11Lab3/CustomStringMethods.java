package U1T11.U1T11Lab3;

public class CustomStringMethods {

    public CustomStringMethods() {
    }

    public boolean longerThan(String myString, int maxLength) {
        if (myString.length() > maxLength) {
            return true;
        }
        return false;
    }

    public String funnyString(String str, int idx) {
        return str.charAt(idx) + str + str.charAt(idx);
    }

    public String halvesReversed(String myString) {
        return myString.substring(myString.length() / 2) + myString.substring(0, myString.length() / 2);
    }

    public String pigLatin(String orig) {
        return orig.substring(1) + orig.charAt(0) + "ay";
    }

    public String removeCharacter(String myString, int removeIdx) {
        try {
            return myString.substring(0, removeIdx) + myString.substring(removeIdx + 1);
        } catch (StringIndexOutOfBoundsException e) {
            if (removeIdx == 0) {
                return myString.substring(1);
            }
            if (removeIdx == myString.length() - 1) {
                return myString.substring(0, removeIdx - 1);
            }
            return myString;
        }
    }

    public String insertAt(String orig, String insertText, String searchStr) {
        try {
            return orig.substring(0, orig.indexOf(searchStr)) + insertText
                    + orig.substring(orig.indexOf(searchStr));
        } catch (StringIndexOutOfBoundsException e) {
            return orig + insertText;
        }
    }

    public String endUp(String myString, int numToCap) {
        try {
            return myString.substring(0, myString.length() - numToCap)
                    + myString.substring(myString.length() - numToCap, myString.length()).toUpperCase();
        } catch (StringIndexOutOfBoundsException e) {
            return myString.toUpperCase();
        }
    }

    public String yellOrWhisper(String myString) {
        if (Character.isUpperCase(myString.charAt(0))) {
            return myString.toUpperCase();
        }
        return myString.toLowerCase();
    }
}
