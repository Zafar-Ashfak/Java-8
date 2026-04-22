// Creating thread using Runnable Interface

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread starts...");

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("\nThread ends!!");
    }
}
