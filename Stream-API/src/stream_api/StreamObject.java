package stream_api;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        // 1. stream empty method
       Stream<Object> emptyStream = Stream.empty();
        System.out.println(emptyStream);

        // 2. filter string array using stream api
       String[] names = {"Ashfaq",  "Sajid", "Sachin", "Atul", "Sams", "Sahil"};
       Stream<String> filteredNames = Stream.of(names);
       filteredNames.forEach(System.out::println);

       // 3. string builder
        Stream<Object> streamBuilder = Stream.builder().build();

        // 4. print numbers using IntStream API
        IntStream stream = Arrays.stream(new int[]{2, 12, 5, 6});
        stream.forEach(System.out::println);
    }
}
