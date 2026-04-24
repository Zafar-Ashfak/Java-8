package stream_api;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> list1 =  List.of(1, 5, 3, 2, 13, 6, 9, 4, 15, 11, 8);

        // ----->>>>>>>>>> Methods <<<<<<<<<<-------
        // 1. Filter Method
        List<Integer> filteredList = list1.stream().filter(e -> e > 3 && e < 13).toList();

//        System.out.println(filteredList);

        List<Integer> list2 = List.of(25, 16, 81, 100, 9, 144);

        list2.stream()
                .map(n -> (int) Math.sqrt(n))
                .forEach(System.out::println);



    }
}
