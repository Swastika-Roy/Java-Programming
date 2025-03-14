package Java.ListInterface.OOPs.Problems;
class Sphr{
    double radius;
    Sphr(double radius){
       this.radius = radius;
    }
    double area(double radius){
        return 4*3.14*radius*radius;
    }
    double vol(double radius){
        return (4/3)*3.14*radius*radius;
    }
    void display(){
        System.out.println(area(radius));
        System.out.println(area(vol(radius)));
    }
}
public class ass2 {
    public static void main(String[] args) {
        Sphr obj = new Sphr(4);
        obj.display();
    }
}
