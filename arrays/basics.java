package Java.arrays;
import java.util.Scanner;
public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ") ;
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter " + n + " elements" );
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The " +n + " elements are : ");
        for (int i = 0; i < n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
