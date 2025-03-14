package Java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class operations1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,6,7,1234,7,8,9);
        List<Integer> filteredlist = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x/2)
                .distinct()
                .sorted((a,b) -> (a-b))
                .limit(4)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(filteredlist);


    }
}
