package Java.ListInterface.OOPs.Problems;
class Sphere{
    double radius  = 10;
    double x = 1,y = 2;

    //default
    Sphere(){
        System.out.println("radius = " +radius+" Coordinates are "+x+" "+y);
    }

    //parameterised
    Sphere(double radius,double x,double y){
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    void display(){
        System.out.println("radius "+radius+" Coordinates "+x+" "+y);
    }
}

public class ass {
    public static void main(String[] args) {
        Sphere s = new Sphere(20,3,5);
         s.display();
    }
}
