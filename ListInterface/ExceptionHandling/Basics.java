package Java.ListInterface.ExceptionHandling;

public class Basics {
    public static void main(String[] args) {
//        int arr[] = new int[5];
//        System.out.println("Hello Guys");
//        try {
//            int res = 5/0;
//            System.out.println(arr[8]);
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Try to access the out of bound element ");
//        } catch (ArithmeticException e){
//            System.out.println(e.getStackTrace());
//            System.out.println(e.getMessage());
//            System.out.println(e);
//        }

//        int arr[] = new int[5];
//        System.out.println("Hello Guys");
//        try {
//            int res = 5/0;
//            System.out.println(arr[7]);
//        }catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e){
//            System.out.println("exception handling");
//        }

        int arr[] = new int[5];
        System.out.println("Hello Guys");
        try {
            int res = 5 / 0;
            System.out.println(arr[7]);
        }catch (Exception e){
            System.out.println("all exception handled");
        }
        System.out.println("bye guys");
    }
}
