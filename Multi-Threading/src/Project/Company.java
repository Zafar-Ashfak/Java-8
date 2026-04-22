package Project;

public class Company {

    int n;
    boolean hasItem = false;

     synchronized public void produceItem(int n) {
         while (hasItem) {
             try {
                 wait();
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
         this.n = n;
         System.out.println("Produced : " + this.n);
         hasItem = true;
         notify();
    }

    synchronized public int consumeItem()  {
         while (!hasItem) {
             try {
                 wait();
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }

        System.out.println("Consumed: " + this.n);
         hasItem = false;
         notify();
         return this.n;
    }
}
