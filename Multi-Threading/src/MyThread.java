// Creating thread using Thread class

public class MyThread extends Thread {

    public void run() {
        System.out.println("Thread starts...");
        for (int i = 0; i <= 20 ; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("\nThread ends!!");
    }

}
