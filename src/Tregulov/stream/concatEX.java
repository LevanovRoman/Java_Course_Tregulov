package Tregulov.stream;

import java.util.stream.Stream;

public class concatEX {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7);
        Stream<Integer> stream2 = Stream.of(12, 22, 32, 42, 52, 62, 72);
        Stream<Integer> stream3 = Stream.of(120, 220, 32, 420, 52, 620, 72);
        Stream<Integer> stream4 = Stream.concat(stream2, stream3);
        stream4.forEach(System.out::println);

    }
}
