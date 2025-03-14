package Java.arrays.Sorting;

public class SelectionSort {
    public static void SelectionSortedArr(int arr[]){
        for (int i = 0; i < arr.length - 1; i++){
            int Smallest = i;
            for (int j = i+1; j < arr.length; j++){
               if (arr[Smallest] > arr[j]){
                   Smallest = j;
               }
            }
            int temp = arr[Smallest];
            arr[Smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        SelectionSortedArr(arr);
    }
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
