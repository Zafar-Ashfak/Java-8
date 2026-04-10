package stream_api;

import java.util.List;

public class FilterAndMap {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Ball", "King", "Dog", "Ant", "Girl", "Mango", "Train", "Ink", "Queen", "Flower");

//        words.stream().filter(e -> e.startsWith("A")).forEach(System.out::println);
        words.stream().filter(e -> e.length() < 5).forEach(System.out::println);

        List<Integer> nums = List.of(2, 6, 3, 9, 10, 5);
        nums.stream().map(e -> e * e).forEach(i -> System.out.print(i + " "));
    }
}
