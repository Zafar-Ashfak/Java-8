public class Main {
    static void main() {
        // Run the thread using Runnable interface
        MyRunnable t1 = new MyRunnable();
        Thread thr = new Thread(t1);
        thr.start();

        // Run the thread using Thread class
        MyThread t2 = new MyThread();
        t2.start();
    }
}
