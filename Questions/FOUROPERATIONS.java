package Java.Questions;

public class FOUROPERATIONS {
    public static void main(String[] args) {
        //delete
        StringBuilder Str = new StringBuilder("Hello");
        System.out.println(Str);
        Str.delete(1,2);//e
        System.out.println(Str);

        //replace
        StringBuilder St = new StringBuilder("Hello");
        System.out.println(St);
        St.replace(1,3,"mi");
        System.out.println(St);

        //insert
        StringBuilder S = new StringBuilder("Hello");
        System.out.println(S);
        S.insert(3,"no");
        System.out.println(S);

        //append
        StringBuilder Stu = new StringBuilder("Hello");
        System.out.println(Stu);
        Stu.append(" roy");
        System.out.println(Stu);

    }
}
