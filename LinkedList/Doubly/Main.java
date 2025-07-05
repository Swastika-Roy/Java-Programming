package Java.LinkedList.Doubly;

import Java.LinkedList.LL;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertLast(100);
        list.insert(100,99);
        list.display();
    }
}
