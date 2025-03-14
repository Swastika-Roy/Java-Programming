package Java.streams;

import java.util.Arrays;

public class basics {
    public static void main(String[] args) {
        //imperative approach
        int arr[] = {1,2,3,4,5,};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);

        //declarative approach
        int arr2[] = {1,2,3,4,5};
        int sum2 = Arrays.stream(arr2).filter(n -> n % 2 == 0).sum();
        System.out.println(sum2);
    }
}
