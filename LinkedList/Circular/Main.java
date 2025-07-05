package Java.LinkedList.Circular;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.display();
        list.delete(4);
        list.display();
    }
}
