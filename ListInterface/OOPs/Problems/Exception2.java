package Java.ListInterface.OOPs.Problems;

public class Exception2 {
    public static void main(String[] args) {
        int int_marks = 80;
        int ext_marks = 500;
        display_internal(int_marks);
        display_external(ext_marks);
    }
    static void display_internal (int int_marks) throws RuntimeException{
       if(int_marks > 30 || int_marks < 0 ){
           throw new RuntimeException("invalid");
       }
       else {
           System.out.println(int_marks);
       }
    }
    static void display_external(int ext_marks) throws RuntimeException{
        if(ext_marks > 70 || ext_marks < 0 ){
            throw new RuntimeException("invalidate");
        }
        else {
            System.out.println(ext_marks);
        }
    }
}
