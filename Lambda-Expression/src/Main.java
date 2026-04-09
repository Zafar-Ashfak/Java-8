//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        // Way 1. Create a separate class and implements the interface
//        InterfaceImpl impl = new InterfaceImpl();
//        impl.greet();
//
//
//        // Way 2. Create an anonymous class for implementing interface
//        MyInterface m1 = new InterfaceImpl() {
//            public void greet() {
//                System.out.println("Hello from anonymous class 1");
//            }
//        };
//
//        m1.greet();
//
//       MyInterface m2 = new InterfaceImpl() {
//           public void greet() {
//               System.out.println("Hello from anonymous class 2");
//           }
//       };
//
//       m2.greet();

       // Way 3. Lambda expression for implementing interface
        MyInterface l1 = () -> {
            System.out.println("Hello from lambda implementation");
        };

        l1.greet();


        MyInterface l2 = () -> System.out.println("Hello from lambda implementation second time.");
        l2.greet();
    }
}