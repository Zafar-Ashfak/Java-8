public class Main {
    static void main() {
        // Run the thread using Runnable interface
        ThreadOne t1 = new ThreadOne();
        Thread thr = new Thread(t1);
        thr.start();

        // Run the thread using Thread class
        ThreadTwo t2 = new ThreadTwo();
        t2.start();
    }
}
