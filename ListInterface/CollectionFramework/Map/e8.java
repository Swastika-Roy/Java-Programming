package Java.ListInterface.CollectionFramework.Map;

import java.util.HashMap;

// map - mapping of key value pairs
// hashmap,Linkedhashmap,treemap
public class e8 {
    static void HashmapExmples(){
        HashMap<Integer,String> mp = new HashMap<>();
        mp.put(1,"Swati");
        mp.put(2,"Rahul");
        mp.put(3,"Ajay");
        mp.put(4,"Anil");
        mp.putIfAbsent(1,"Arnab");
        //iterating over key
        for(Integer i : mp.keySet()){
            System.out.print(i + " ");
        }
        System.out.println();
       //iterating over values
        for(var i : mp.values()){
            System.out.print(i + " ");
        }
        System.out.println();
        //iterating over keyValue pairs
        for (var e : mp.entrySet()){
//            System.out.println(e);
            System.out.println(e.getKey());
      }

//        System.out.println(mp);
//        System.out.println(mp.entrySet());
//        System.out.println(mp.keySet()); // for displaying keys
//        System.out.println(mp.values()); // for displaying values
//        System.out.println(mp.get(2));
//        System.out.println(mp.size());
//        System.out.println(mp.isEmpty());
//        System.out.println(mp.containsKey(4));
//        System.out.println(mp.containsValue("Swati"));
    }
    public static void main(String[] args) {
      HashmapExmples();
    }
}
