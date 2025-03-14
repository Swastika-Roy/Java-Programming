package Java.Strings.Questions;

public class printEvenaLengthofwords {
    public static void main(String[] args) {
        String str = "hello hi bye bye guys";

        for (String s : str.split(" ")){
            if(s.length() % 2 == 0){
                System.out.println(s);
            }
        }
    }
}
