package stream_api;

import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
       Stream<Object> emptyStream = Stream.empty();
        System.out.println(emptyStream);

       String[] names = {"Ashfaq",  "Sajid", "Sachin", "Atul", "Sams", "Sahil"};
       Stream<String> filteredNames = Stream.of(names);
       filteredNames.forEach(System.out::println);
    }
}
