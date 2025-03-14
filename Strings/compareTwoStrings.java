package Java.Strings;

public class compareTwoStrings {
    public static void main(String[] args) {
        String s1 = "Ladoo";
        String s2 = new String("Ladoo");
        System.out.println(s1 == s2); // false because "==" creates two different memory address.
        System.out.println(s1.equals(s2)); // true because .equals compares two values of the two strings.

    }
}
