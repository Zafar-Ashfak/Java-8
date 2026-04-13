package method_reference;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MyTask {
    public static void doTask() {
        System.out.println("I am going to build RESTful API");
        LocalDateTime todayDate = LocalDateTime.now();
        System.out.println(todayDate.toString());
    }

    public static void table()  {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 " + " X " + i + " = " + (2 * i));

            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }


    public void printTill20() {
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
