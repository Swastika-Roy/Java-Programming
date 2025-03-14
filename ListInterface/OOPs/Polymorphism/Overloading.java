package Java.ListInterface.OOPs.Polymorphism;
// poly means many and morphism means different forms.

//Overloading definition: Overloading occurs when two or more methods in the
// same class have the same name but different parameters.

//Method overloading is also called compile-time polymorphism, static polymorphism, or early binding.
// In Method overloading, the child argument takes precedence over the parent argument.
public class Overloading {
    public static class Student{

        public int info(int roll){
            return roll;
        }
        public String info(String name){
            return name;
        }
    }
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.info(1));
        System.out.println(st.info("sita"));
    }
}
