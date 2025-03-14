package Java.Strings.Questions;

import static java.util.Arrays.stream;

public class DeleteColumnsToMakeSorted {
    public static int DeleteColumns(String str[]){
        int deleteCount = 0;
        for (int j = 0; j  < str[0].length();j++){
            for (int i = 1; i < str.length;i++){
                if(str[i].charAt(j) < str[i-1].charAt(j)){
                    deleteCount++;
                    break;
                }
            }
        }
        return deleteCount;
    }
    public static void main(String[] args) {
        String str[] = {"abc", "cba", "cee"};
        System.out.println(DeleteColumns(str));
    }

}
