public class Main {
    static void main() {
//        MyInterface inter = () -> {
//            System.out.println("Hello from main class.");
//        };
//
//        inter.greet();

        MyInterface inter = MyIntroduction::intro;
        inter.greet();
    }
}
