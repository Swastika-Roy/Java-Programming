package Java.ListInterface.CollectionFramework.Map.QueueInterface;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Example5 {
    public static void PriorityQueue(){
//  PriorityQueue<Integer> pq = new PriorityQueue<>();
 PriorityQueue<Integer> pq = new PriorityQueue(Comparator.reverseOrder());
        pq.add(10);
        pq.add(9);
        pq.add(1);
        pq.add(11);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.size());
    }
    public static void main(String[] args) {
           PriorityQueue();
    }
}
