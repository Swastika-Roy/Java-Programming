package Java.ListInterface.CollectionFramework.Map.QueueInterface;


import java.util.Deque;
import java.util.LinkedList;

public class exmple6 {
    public static void Dequeue() {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(4);
        dq.addLast(5);
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq.size());
    }

    public static void main(String[] args) {
         Dequeue();
    }
}