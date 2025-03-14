package Java.streams;

import java.util.stream.Stream;

public class operation3 {
    public static void main(String[] args) {
        Integer integer = Stream.iterate(0,x -> x + 1).limit(101).map(x -> x/10).distinct()
                .peek(System.out::println)
                .max((a,b)->(a-b)).get();
        System.out.println(integer);

        long integer2 = Stream.iterate(0,x -> x + 1).limit(101).map(x -> x/10)
                .map(x->x/20)
                .distinct()
             .count();
        System.out.println(integer2);

    }
}
