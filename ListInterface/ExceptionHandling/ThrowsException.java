package Java.ListInterface.ExceptionHandling;

public class ThrowsException {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            getNumber(arr);
        } catch (Exception e){
            System.out.println("catched exception " + e.getMessage());
        }

    }
    static int getNumber(int arr[]) throws ArrayIndexOutOfBoundsException{
        return arr[8];
    }
}
