package Java.ListInterface.ExceptionHandling;

import java.util.Scanner;

public class CustomExceptions {
    static class MyExceptions extends Exception{
        public MyExceptions(String message){
            super(message);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter age = ");
        try {
            int age = sc.nextInt();
            if(age > 100) {
               // throw new MyExceptions("My error is this");
                throw new ArithmeticException("Age more than 100 not allowed");
            }
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
