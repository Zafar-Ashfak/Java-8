public class Main {
    static void main() {
//        MyInterface inter = () -> {
//            System.out.println("Hello from main class.");
//        };
//
//        inter.greet();

//        MyInterface inter = MyIntroduction::intro;
//        inter.greet();

        // Calling static method from PrintTable class
        Runnable runnable = PrintTable::table;
        Thread t1 = new Thread(runnable);
//        t1.start();


        // Calling non-static method from PrintTable class
        PrintTable p2 = new PrintTable();
        Runnable runnable1 = p2::table2;
        Thread t2 = new Thread(runnable1);
        t2.start();
    }
}
