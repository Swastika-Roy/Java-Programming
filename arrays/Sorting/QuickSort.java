package Java.arrays.Sorting;

public class QuickSort {
    public static void printarr(int arr[]){
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static void swap(int arr[],int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static int partion(int arr[],int st,int end){
        // locating pivot index in correct position
     int pivot = arr[st];
     int count = 0;
     for (int i = st+1; i <= end;i++){
         if(arr[i] <= pivot) count++;
     }
     int pivotidx = st+count;
     swap(arr,st,pivotidx);
     int i = st, j = end;
     while (i < pivotidx && j > pivotidx){
         while (arr[i] <= pivot) i++;
         while (arr[j] > pivot) j--;
         if(i < pivotidx && j > pivotidx){
             swap(arr,i,j);
             i++;
             j--;
         }
     }
     return pivotidx;
    }
    public static void quickSort(int arr[],int st, int end){
        if(st >= end) return;
        int pi = partion(arr,st,end);
        quickSort(arr,st,pi-1);
        quickSort(arr,pi+1,end);
    }
    public static void main(String[] args) {
        int arr[] = {7, 8, 9, 7, 1, 2};
        printarr(arr);
        quickSort(arr,0,arr.length-1);
        printarr(arr);
    }
}
