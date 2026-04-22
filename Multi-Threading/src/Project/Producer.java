package Project;

public class Producer implements Runnable {
    Company c;

    public Producer(Company c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println("Item is producing...");
        int i = 1;

        while (true) {
            this.c.produceItem(i);
            i++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
