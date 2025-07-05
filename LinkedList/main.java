package Java.LinkedList;

public class main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(100);
        list.insert(50,4);
        list.display();
//        System.out.println(list.deleteFirst());
//        System.out.println(list.deleteLast());
        System.out.println(list.delete(4));
        list.display();
    }
}
