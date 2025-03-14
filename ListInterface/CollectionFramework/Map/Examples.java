package Java.ListInterface.CollectionFramework.Map;

import java.util.ArrayList;

public class Examples {
    static void ArraylistExamples(){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        System.out.println(l);
        System.out.println(l.get(1));//index based
        l.set(1,9);
        System.out.println(l);
        System.out.println(l.contains(9));//true
    }
    public static void main(String[] args) {
           ArraylistExamples();
    }
}
