package Java.Questions;

 class Example {

}

public class FourthQ {
     static void print(int x) {
         x = 10;
     }
         int val;
         public static void ref(FourthQ obj){
             obj.val = 10;
         }

    public static void main(String[] args) {
//        int x = 5;
//        print(x);
//        System.out.println(x);
        FourthQ obj = new FourthQ();
        obj.val = 5;
        ref(obj);
        System.out.println(obj.val);
    }

}
