package Java.Questions;
class Father{
    String name;
    Father(String name){
        this.name = name;
    }
}
class Son extends Father{
      int age;
      Son(String name,int age){
          super(name);
          this.age = age;
      }
}
class GrandSon extends Son{
      String address;
      GrandSon(String name,int age,String address){
          super(name,age);
          this.address =address;
      }
      void display(){
          System.out.println("name = "+name);
          System.out.println("age = "+age);
          System.out.println("address = "+address);
      }
}
public class FifteenthQ {
    public static void main(String[] args) {
        GrandSon gd = new GrandSon("Dadu",19,"malkera");
        gd.display();
    }
}
