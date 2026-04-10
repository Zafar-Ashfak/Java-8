package stream_api;

import java.util.List;

public class FilterAndMap {
    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Ball", "King", "Dog", "Ant", "Girl", "Mango", "Train", "Ink", "Queen", "Flower");

        // Filter method
//        words.stream().filter(e -> e.startsWith("A")).forEach(System.out::println);
        words.stream().filter(e -> e.length() < 5).forEach(System.out::println);

        List<Integer> nums = List.of(2, 6, 3, 9, 10, 5, 7, 11, 32, 44, 14);

        // Map method
        nums.stream().map(e -> e * e).forEach(i -> System.out.print(i + " "));
        System.out.println();

        // Sorted method
       List<Integer> sortedNums = nums.stream().sorted().toList();
        System.out.println(sortedNums);

        // Get min element from the list
        int min = nums.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Min element is: " + min);

        // Get Max element from the list
        int max = nums.stream().max(Integer::compareTo).get();
        System.out.println("Max element is: " + max);
    }
}
