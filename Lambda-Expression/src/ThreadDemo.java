public class ThreadDemo {
    public static void main(String[] args) {

        // Print number from 1 to 10 using Runnable Class
        Runnable thread1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };

//        thread1.run();
//        System.out.println();

        // Print even number using Runnable Class
        Runnable thread2 = () -> {
            for (int i = 1; i <= 50; i++) {
               if (i % 2 == 0) {
                   System.out.print(i + " ");
               }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }


        };

        thread2.run();
    }
}
