package Java.arrays.Sorting;

public class InsertionSort {
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void InserTionSortedArr(int arr[]){
        for (int i = 1; i < arr.length;i++){
            int Current = arr[i];
            int j = i-1;
            while (j >= 0 && Current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = Current;
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        InserTionSortedArr(arr);
    }
}
