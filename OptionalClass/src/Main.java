import java.util.Optional;

public class Main {
    static void main() {
        String str = "Md Ashfaq Alam";

//        if (str == null) {
//            System.out.println("Null string");
//        } else {
//            System.out.println(str.length());
//        }

        Optional<String> name = Optional.ofNullable(str);
        System.out.println(name.get());
        System.out.println(name.orElse("Default Value"));
        System.out.println(name.isPresent());



    }
}
