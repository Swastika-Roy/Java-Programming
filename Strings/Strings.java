package Java.Strings;

public class Strings {
    public static void main(String[] args) {
        String s1 = "code";
        String s2 = "code";
        System.out.println(s1 == s2); // true because both s1 and s2 are pointing to the same string literal
                                      // "code" in string literal pool in heap area.

        // with one object there are two string literals created one in string constant pool as it is
        // created by string literal.
        String s = "Decode";
        String S = new String("Decode");
        // and one in heap as it is created by "new" operator and no new object is created in string literal
        // pool as it is already craeted by "s".
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s3 == s4); //false because there are new objects s3 and s4 created in heap area
                                      // and both are pointing to different string literals.
    }
}
