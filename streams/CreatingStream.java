package Java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple","banana","guava");
        Stream<String> stream = list.stream();

        String[] arr = {"car","bus","auto"};
        Stream<String> stream1 = Arrays.stream(arr);

        Stream<Integer> intstream = Stream.of(1,2,3);

        Stream<Integer> limit = Stream.iterate(0,n -> n+1).limit(100);

        Stream<Integer> limit1 = Stream.generate(() -> (int)Math.random() * 100).limit(5);
    }
}
