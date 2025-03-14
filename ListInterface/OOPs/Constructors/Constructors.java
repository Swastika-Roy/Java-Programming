package Java.ListInterface.OOPs.Constructors;
//A constructor is a special function in object-oriented programming
// that initializes an object when it is created:
// properties -> should be created with the same class name
           // -> doesn't have return type
           // -> should be called for one object at a time
public class Constructors {
    // Default Constructor
      public static class Student{
          int roll;
          String name;
          //Default Constructor
          Student(){

          }
          //Paramitarised Constructor
          Student(int roll,String name){
              this.roll = roll;
              this.name = name;
          }
          //copy Constructor
        Student(Student s2){
              this.roll = s2.roll;
              this.name = s2.name;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.roll);
        Student s2= new Student(2,"Ram");
        Student s3 = new Student(s2);
        System.out.println(s3.roll);
        System.out.println(s3.name);
    }
}
