package Java.Strings;

public class Immutabality {
    // strings are immutable
    public static void main(String[] args) {
        String s1 = "Java";
        System.out.println(s1.hashCode());//2301506

         s1 = s1 + "Coders";
        System.out.println(s1.hashCode());//818922960

        // reason because both are giving different hashcodes.
        // in second case s1 will point to "JavaCoders" rather pointing to "Java" because strings are
        // immutable therefore it will not modify s1 rather it will point to appending one.
    }
}
