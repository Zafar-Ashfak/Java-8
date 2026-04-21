// Creating thread using Thread class

public class ThreadTwo extends Thread {

    public void run() {
        for (int i = 1; i <= 20 ; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
