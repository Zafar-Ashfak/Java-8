//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Way 1. Create a separate class and implements the interface
        InterfaceImpl impl = new InterfaceImpl();
        impl.greet();


        // Way 2. Create an anonymous class for implementing interface
        MyInterface i1 = new InterfaceImpl() {
            public void greet() {
                System.out.println("Hello from anonymous class 1");
            }
        };

        i1.greet();

       MyInterface i2 = new InterfaceImpl() {
           public void greet() {
               System.out.println("Hello from anonymous class 2");
           }
       };

       i2.greet();

    }
}