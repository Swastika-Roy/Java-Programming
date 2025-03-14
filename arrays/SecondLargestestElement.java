package Java.arrays;


public class SecondLargestestElement {
    public static int printSecondLargest(int arr[]){
        int max = -1,lrg = -1;
        for (int i = 0; i < arr.length;i++){
            if(arr[i] > max){
                lrg = max;
                max = arr[i];
            }
            if (arr[i] < max && arr[i] > lrg){
                lrg = arr[i];
            }
        }
        return lrg;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,4};
        System.out.println(printSecondLargest(arr));
    }
}
