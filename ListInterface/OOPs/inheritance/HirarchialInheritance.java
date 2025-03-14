package Java.ListInterface.OOPs.inheritance;

public class HirarchialInheritance {
    static class Shapes{
        void area(){
            System.out.println("displays area");
        }
    }
    static class Triangle extends SingleInheritance.Shapes {
        void area(int b,int h){
            System.out.println("0.5 * b * h");
        }
    }
    static class Circle extends Shapes{
        void area(int r){
            System.out.println("3.14 * r * r");
        }
    }

    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.area();
        Triangle t = new Triangle();
        t.area(5,6);
        Circle c = new Circle();
        c.area(3);
    }
}
