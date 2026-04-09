public class ThreadDemo {
    public static void main(String[] args) {

        Runnable thread1 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        };

        thread1.run();

    }
}
