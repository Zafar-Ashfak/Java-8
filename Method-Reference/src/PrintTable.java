public class PrintTable {
    public static void table() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2" + " X " + i + " = " + (2 * i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    
    public void table2() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("10" + " X " + i + " = " + (10 * i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw  new RuntimeException(e);
            }
        }
    }
}
