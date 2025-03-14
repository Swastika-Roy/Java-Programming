package Java.ListInterface.Hashmap;

import java.util.HashMap;

public class Basics {
    static void Hashmap(){
        HashMap<String,Integer> hs = new HashMap<>();
        hs.put("Akash",21);
        hs.put("yash",16);
        hs.put("lav",17);
        hs.put("Rishika",19);
        hs.put("Harry",18);
//        System.out.println(hs.get("yash"));
        for (String key : hs.keySet()){
            System.out.print(key + " ");
        }
        System.out.println();
        for (int val : hs.values()){
            System.out.print(val + " ");
        }
        System.out.println();
//        for(var e : hs.entrySet()){
//            System.out.println("Age of " + e.getKey() + " is " + e.getValue());
//        }
//        System.out.println(hs);
//        System.out.println(hs.get("lav"));
//        System.out.println(hs.get("nambi"));
//        hs.put("Akash",25);
//        System.out.println(hs);
    }
    public static void main(String[] args) {
           Hashmap();
    }
}
