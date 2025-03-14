package Java.Questions;

class Demo{
    static int count;

    static {
         count = 10;
        System.out.println("static block");
    }

    static void print(){
        System.out.println("Count = "+count);
    }
}
public class FifthQ {
    public static void main(String[] args) {
        Demo.print();
    }
}
