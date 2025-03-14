package Java.ListInterface.CollectionFramework.Map.SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class e7 {
    public static void Hashset(){
        //unordered set
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        System.out.println(hs);
        hs.add(55);
        hs.add(6);
        hs.add(1);
        hs.add(2);
        System.out.println(hs);
        hs.remove(2);
        System.out.println(hs);
        System.out.println(hs.contains(2));
        System.out.println(hs.size());
    }
    public static void linkedHashset(){
        // ordered set compressed of linkedlist + hashset property
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(55);
        ls.add(6);
        System.out.println(ls);
    }
    public static void Treeset(){
        //sorted set
        // uses self balancing binary search tree
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(6);
        ts.add(9);
        ts.add(4);
        System.out.println(ts);
    }
    public static void main(String[] args) {
//        Hashset();
//        linkedHashset();
        Treeset();
    }
}
