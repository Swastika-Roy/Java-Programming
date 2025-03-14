package Java.Strings.practice;

import java.util.Arrays;

public class checkanagrams {
    public static void main(String[] args) {
        String str1 = "mom";
        String str2 = "omm";
        System.out.println(CheckAnagrams(str1,str2));
    }
    public static boolean CheckAnagrams(String str1,String str2){
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);
    }
}
