package Java.Strings.Questions;

import java.util.Scanner;

public class ReverseStringInJava {
    public static void main(String[] args) {
        String input,reverse = "";
        System.out.println("enter input string : ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        for (int i = input.length() - 1; i >= 0; i--){
            reverse = reverse + input.charAt(i);
        }
        System.out.println(reverse);
    }
}
