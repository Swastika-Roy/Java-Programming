package Java.ListInterface.ExceptionHandling;

public class FinallyBlockInExceptions {
    public static void main(String[] args) {
        int arr[] = new  int[5];
        System.out.println("hello world");
        try {
            System.out.println(arr[3]);
//            System.out.println(arr[8]);
        }catch (Exception e){
            System.out.println("all exceptions handled");
        } finally {
            System.out.println("I will run always");
        }
        System.out.println("Bye World");
    }
}
