package Java.Questions;
class P {
    void print(){
        System.out.println("Cindrella");
    }
}
class Q extends P{
    void display(){
        System.out.println("sleeping beauty");
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Q obj = new Q();
        obj.print();
        obj.display();
    }
}
