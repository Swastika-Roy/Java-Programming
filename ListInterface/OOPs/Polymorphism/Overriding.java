package Java.ListInterface.OOPs.Polymorphism;
//Overriding definition: Method overriding is the act of declaring a method in a subclass
//that is already present in a parent class.

//The main reason for having overridden methods in the child class is to
//        have a different implementation for a method in the parent class.

// also the example of single inheritance
public class Overriding {
     public static class Shapes{
         int sides;
     }
     public static class Triangle extends Shapes{
         int vertex;
     }
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.sides = 3;
        System.out.println(t.sides);
        t.vertex = 3;
        System.out.println(t.vertex);
    }
}
