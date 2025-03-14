package Java.Strings.Questions;

import java.util.Scanner;

public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string : ");
        String org = sc.nextLine();
        String rev = "";
        for (int i = org.length() - 1; i >= 0; i--){
            rev = rev + org.charAt(i);
        }
        if(org.equals(rev)){
            System.out.println("palindromic");
        }else {
            System.out.println("not palindromic");
        }
    }
}
