package stream_api;

import java.util.Comparator;
import java.util.List;

public class FilterAndMap {


    public static void main(String[] args) {
        List<String> words = List.of("Apple", "Ball", "King", "Dog", "Ant", "Girl", "Mango", "Train", "Ink", "Queen", "Flower");

        // Filter method
//        words.stream().filter(e -> e.startsWith("A")).forEach(System.out::println);
        words.stream().filter(e -> e.length() < 5).forEach(System.out::println);

        List<Integer> nums = List.of(2, 6, 3, 9, 10, 5, 7, 11, 32, 44, 14);

        // Map method
        System.out.println("Square of each element");
        nums.stream().map(e -> e * e).forEach(i -> System.out.print(i + " "));
        System.out.println();

        // Sorted in ascending order method
       List<Integer> sortedAsc = nums.stream().sorted().toList();
        System.out.println("Ascending Order sorting");
        System.out.println(sortedAsc);

        // Sorted in descending order method
        List<Integer> sortedDesc = nums.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Descending Order sorting");
        System.out.println(sortedDesc);

        // Get min element from the list
        Integer min = nums.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Min element is: " + min);

        // Get Max element from the list
        Integer max = nums.stream().max(Integer::compareTo).get();
        System.out.println("Max element is: " + max);
    }
}
