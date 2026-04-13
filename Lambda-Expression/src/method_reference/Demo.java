package method_reference;

public class Demo {
    public static void main(String[] args) {
//        WorkInterface workInterface = () -> {
//            System.out.println("Hi, I am Md Ashfaq Alam.");
//        };
//
//        workInterface.doTask();

        WorkInterface workInterface = MyTask::doTask;
        workInterface.task();

        // Referencing static method
        Runnable table = MyTask::table;
        table.run();

        // Referencing Non-static method
        MyTask obj = new MyTask();
        Runnable printTill20 = obj::printTill20;
        printTill20.run();
    }
}
