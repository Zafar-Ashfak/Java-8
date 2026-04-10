package stream_api;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(2, 5, 7, 4, 6, 11, 12, 15, 19, 18, 20, 14, 17);

        List<Integer> list2 = Arrays.asList(11, 14, 12, 19, 4, 2, 3, 6, 17, 15, 21, 26);

        List<Integer> list3 = new ArrayList<>();
        list3.add(2);
        list3.add(7);
        list3.add(3);
        list3.add(4);
        list3.add(9);
        list3.add(5);

        // Add filtered element in the list without using Stream API
        List<Integer> evenList1 = new ArrayList<>();
        for (Integer i : list1) {
            if (i % 2 == 0) {
                evenList1.add(i);
            }
        }

        System.out.println(evenList1);

        // Add filtered element in the list using Stream API
        List<Integer> evenList2 = list1.stream().filter(e -> e % 2 == 0).toList();
        System.out.println(evenList2);

        List<Integer> greaterThan15 = list2.stream().filter(i -> i > 15).toList();
        System.out.println(greaterThan15);
    }




}
