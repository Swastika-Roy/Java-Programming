package Java.Questions;

public class CountDigitsCharacters {
    public static void main(String[] args) {
        String str = "Swastika1234";
        int digits = 0; int
                characters = 0;
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)) digits++;
            if(Character.isLetter(ch)) characters++;
        }
        System.out.println(str);
        System.out.println("digits = "+digits);
        System.out.println("letters = "+characters);
    }
}

