package Project;

public class Consumer implements Runnable{
    Company c;

    public Consumer(Company c) {
        this.c = c;
    }


    @Override
    public void run() {
            while (true) {
                this.c.consumeItem();
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
    }
}
