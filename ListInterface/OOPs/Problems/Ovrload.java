package Java.ListInterface.OOPs.Problems;

public class Ovrload {
    void overload(){
        System.out.println("OOps");
    }
    void printdemo(String a){
        for (int i = 0; i < 2; i++) {
            System.out.println("two times "+a);
        }
    }
    void printdemo(String a,int k){
        for (int i = 0; i < k;i++){
            System.out.println("three times" + a);
        }
    }

    public static void main(String[] args) {
        Ovrload obj = new Ovrload();
        obj.overload();
        String a = "HiiJava";
        obj.printdemo(a);
        obj.printdemo(a,3);
    }
}
