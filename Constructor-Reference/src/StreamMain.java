import java.util.List;

public class StreamMain {
    static void main() {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

//        list.forEach((e) -> {
//            System.out.print(e);
//        });

        list.forEach(System.out::println);
    }
}
