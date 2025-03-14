package Java.Questions;

public class Comparable {
    public static void main(String args[]){
        String s1 = "hello";
        String s2 = "hello";
        if(s1.equals(s2)){
            System.out.println("Both are same");
        } else if (s1 == s2) {
            System.out.println("have same location");
        }else{
            System.out.println("none");
        }
    }
}
