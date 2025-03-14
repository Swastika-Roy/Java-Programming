package Java.ListInterface.Hashmap.Questions;

import java.util.HashMap;

public class CalculateFrequency {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,1,1,1};
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int ele : arr){
            if(!mp.containsKey(ele)){
                mp.put(ele,1);
            }
            else{
                mp.put(ele,mp.get(ele) + 1);
            }
        }
        System.out.println(mp.entrySet());
        int mxfreq = 0, anskey = -1;
        for(var key : mp.keySet()){
            if (mp.get(key) > mxfreq){
                mxfreq = mp.get(key);
                anskey = key;
            }
        }
        System.out.println(anskey + " has maxm frequency of " + mxfreq);
    }
}
