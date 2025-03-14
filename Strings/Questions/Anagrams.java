package Java.Strings.Questions;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
      String str1 = "java";
      String str2 = "avaj";
        System.out.println(checkAnagrams(str1,str2));
    }

    public static boolean checkAnagrams(String str1, String str2) {
        char[] charrstr1 = str1.toCharArray();
        char[] charrstr2 = str2.toCharArray();
        Arrays.sort(charrstr1);
        Arrays.sort(charrstr2);
        return Arrays.equals(charrstr1,charrstr2);
    }
}