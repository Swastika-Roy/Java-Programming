package Java.arrays;

public class Practice {
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void swap(int arr[],int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int partition(int arr[],int st,int end){
        int pivot = arr[st];
        int count = 0;
        for (int i = st+1;i <= end;i++){
            if(arr[i] <= pivot) count++;
        }
        int pivotIdx = st+count;
        swap(arr,st,pivotIdx);
        int i = st, j = end;
        while (i < pivotIdx && j > pivotIdx){
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if(i < pivotIdx && j > pivotIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    public static void QuickSort(int arr[],int st,int end){
        if(st >= end) return;
        int pi = partition(arr,st,end);
        QuickSort(arr,st,pi-1);
        QuickSort(arr,pi+1,end);
    }
    public static void Merge(int arr[],int l,int mid,int r){
        int n1 = mid - l + 1, n2 = r - mid;
        int left[] = new int[n1];
        int right[] = new int [n2];
        int i,j,k;
        for ( i = 0; i < n1;i++){
            left[i] = arr[l+i];
        }
        for (j = 0; j < n2; j++){
            right[j] = arr[mid+1+j];
        }
        i = 0; j = 0; k = l;
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
           while (i < n1){
               arr[k++] = left[i++];
           }
           while (j < n2){
               arr[k++] = right[j++];
           }
        }

    public static void MergeSort(int arr[],int l, int r){
        int mid = l + (r-l)/2;
        if(l >= r) return;
        MergeSort(arr,l,mid);
        MergeSort(arr,mid+1,r);
        Merge(arr,l,mid,r);
    }
    // time oomplexity of optimised bubble sort is 0(n)
    public static void OptimisedBubbleSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (flag == false) return;
        }
    }
    public static void BubbleSort(int arr[]){
        for(int i = 0; i < arr.length - 1;i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
    public static void SelectionSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++){
            int Smallest = i;
            for (int j = i+1;j < arr.length;j++){
                if(arr[Smallest] > arr[j]){
                    Smallest = j;
                }
            }
            int temp = arr[Smallest];
            arr[Smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }
    public static void InsertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++){
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
//        BubbleSort(arr);
//        SelectionSort(arr);
//        InsertionSort(arr);
//        OptimisedBubbleSort(arr);
//        printArray(arr);
//        MergeSort(arr,0, arr.length-1);
        QuickSort(arr,0,arr.length-1);
        printArray(arr);
    }
}

