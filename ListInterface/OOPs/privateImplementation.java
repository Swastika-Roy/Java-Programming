package Java.ListInterface.OOPs;

 class Employee{
     private int roll;
    String name;
    int getRoll() {
        return roll;
    }
   void setRoll(int roll){
       this.roll = roll;
       return;
   }
    Employee(){
        this.roll = 1;
        this.name = "Swarnali";
//        this.roll = roll;
//        this.name = name;
        }
    }

public class privateImplementation {
    public static void main(String[] args) {
        Employee em = new Employee();
        System.out.println(em.name);
        System.out.println(em.getRoll());
        em.setRoll(5);
        System.out.println(em.getRoll());
    }
}
