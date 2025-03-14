package Java.arrays;

public class MovezeroestoEnd {
    public static void main(String[] args) {
        int arr[] = {1,0,0,3,0,5,0};
        moveZeroestolast(arr);
        printarr(arr);
    }
    public static void printarr(int arr[]){
        for (int i : arr){
            System.out.print(i);
        }
        System.out.println();
    }
    public static void moveZeroestolast(int arr[]){
        int index = 0;
        for (int i = 0; i < arr.length;i++){
            if(arr[i] != 0){
                arr[index++] = arr[i];
            }
        }
        for (int i = index; i < arr.length;i++){
            arr[i] = 0;
        }
    }
}
