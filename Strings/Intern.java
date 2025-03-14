package Java.Strings;

public class Intern {
    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = new String("coding");
        String s3 = s2.intern();
        System.out.println(s1 == s3); // true because both are poiting to same string literal in
        // string constant pool.
        System.out.println(s3 == s2); // false because s3 and s2 are pointing two different things one is
        // pointing to string constant pool and other in heap section.
    }
}
