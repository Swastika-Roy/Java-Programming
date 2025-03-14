package Java.ListInterface.CollectionFramework.Map.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class EXMPL4 {
    public static void QueueExmple(){
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.size());
        System.out.println(q);
    }
    public static void main(String[] args) {
        QueueExmple();
    }
}
