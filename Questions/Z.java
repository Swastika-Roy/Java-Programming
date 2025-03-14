package Java.Questions;

public class Z {
    static int count;
    static {
        count = 10;
        System.out.println("STATIC BLOCK");
    }
    public static void print(){
        System.out.println(count);
    }
    public static void main(String[] args) {
        Z o = new Z();
        o.print();
    }
}

