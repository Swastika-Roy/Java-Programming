package Java.Questions;
 public class Exe{
     int val;
     public static void ref(Exe e){
         e.val = 10;
     }
    public static void main(String[] args) {
        Exe obj = new Exe();
        obj.val = 5;
        ref(obj);
        System.out.println(obj.val);
    }
}

