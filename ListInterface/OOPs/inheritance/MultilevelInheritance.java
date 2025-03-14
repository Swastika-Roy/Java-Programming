package Java.ListInterface.OOPs.inheritance;

public class MultilevelInheritance {
    static class Shapes{
        void info(){
            System.out.println("it has any number of  sides");
        }
    }
    static class Triangle extends SingleInheritance.Shapes {
          void info(int s1,int s2, int s3){
              System.out.println("it has 3 sides");
          }
    }
    static class EquilateralTriangle extends Triangle{
          void info(int side){
              System.out.println("all three sides are equal");
          }
    }

    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.info();
        Triangle t = new Triangle();
        t.info(1,2,3);
        EquilateralTriangle et = new EquilateralTriangle();
        et.info(3);
    }
}
