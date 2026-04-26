public class Main {
    static void main() {
//        InterfaceProvider provider = () -> {
//            return new Student();
//        };
//
//        Student s1 = provider.getStudent();
//        s1.display();


        // Referring class using constructor
        InterfaceProvider provider = Student::new;
        Student s2 = provider.getStudent();
        s2.display();
    }
}
