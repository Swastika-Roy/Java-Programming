package Java.Strings.Questions;

public class ReverseWordInString {
    public static void main(String[] args) {
        String str = "Welcome to HIT";
        String SplitArray[] = str.split(" ");
        for (int i = SplitArray.length - 1; i >= 0; i--){
            System.out.print(SplitArray[i]+ " ");
        }
    }
}
