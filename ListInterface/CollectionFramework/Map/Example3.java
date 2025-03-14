package Java.ListInterface.CollectionFramework.Map;

import java.util.Stack;

public class Example3 {
    public static void StackExmpl(){
        Stack<String> st = new Stack<>();
        st.push("Swastika");
        st.push("Shraddha");
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }
    public static void main(String[] args) {
        StackExmpl();
    }
}
