// Operations on thread
public class threadOp {
    static void main() {
        System.out.println("Program is started...");

        int num1 = 20;
        int num2 = 30;
        System.out.println(num1 + num2);

        // Operations
        Thread thr = Thread.currentThread();
        String threadName =  thr.getName();
        System.out.println("Current running thread is: " + threadName);
        // Setting the name of the current thread
        thr.setName("myMainMethod");
        System.out.println("Now current running thread is: " + thr.getName());


        System.out.println("Program is ended......");
    }
}
