package Java.ListInterface.OOPs.inheritance;

public class SingleInheritance {
    static class Shapes{
        void area(){
            System.out.println("displays area");
        }
    }
    static class Triangle extends Shapes{
        void area(int b,int h){
            System.out.println("0.5 * b * h");
        }
    }

    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.area();
        Triangle t = new Triangle();
        t.area(5,5);
    }
}
