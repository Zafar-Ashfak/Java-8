// Operations on thread


class UserThread implements Runnable {
    public  void run() {
        System.out.println("This is user defined thread");
    }
}

public class threadOp {
    public static void main() throws InterruptedException {
        System.out.println("Program started...");

        int num1 = 100;
        int num2 = 50;
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

        Thread thr = Thread.currentThread();
        System.out.println("Name of the current thread is: " + thr.getName());

        thr.setName("master");
        System.out.println("Now the new name of the current thread is: " + thr.getName());
        System.out.println("Thread Id is: " + thr.threadId());
        System.out.println("Thread group is: " + thr.getThreadGroup());
        System.out.println("Thread context class loader is: " + thr.getContextClassLoader());
        System.out.println("Thread context priority is: " + thr.getPriority());

        System.out.println("\n____________________________________________");

        try {
            System.out.println("\nUser thread is running...");
            UserThread userThr = new UserThread();
            Thread th = new Thread(userThr);
            th.start();

            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program ended...");

    }
}
