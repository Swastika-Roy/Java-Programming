package Java.arrays;

public class revision {
    static void display(int arr[]){
        for (int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }
    static void swap(int arr[],int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int BinarySearch(int arr[], int tar){
        int st = 0, end = arr.length - 1;
        while (st <= end){
            int mid = st + (end - st)/2;
            if(tar < arr[mid]){
                end = mid - 1;
            } else if (tar > arr[mid]) {
                st = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static int partion(int arr[],int st,int end){
        int pivot = arr[st];
        int count = 0;
        for (int i = st+1;i <= end;i++){
            if(arr[i] <= pivot) count++;
        }
        int pivotIndex = st+count;
        swap(arr,st,pivotIndex);
        int i = st, j = end;
        while (i < pivotIndex && j > pivotIndex){
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if (i < pivotIndex && j > pivotIndex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    static void QuickSort(int arr[],int st,int end){
        if(st >= end) return;
        int pi = partion(arr,st,end);
        QuickSort(arr,st,pi-1);
        QuickSort(arr,pi+1,end);
    }
    public static void main(String[] args) {
        int arr[] = {9,7,1,4,5,6,5};
        int array[] = {1,2,3,4,5};
//        display(arr);
//        QuickSort(arr,0, arr.length - 1);
//        display(arr);
        System.out.println(BinarySearch(array,3));
    }
}
