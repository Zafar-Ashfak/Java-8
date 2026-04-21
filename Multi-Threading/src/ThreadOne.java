// Creating thread using Runnable Interface

public class ThreadOne implements Runnable {

    @Override
    public void run() {
        // Task
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
