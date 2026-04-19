public class FinallyBlockInException {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Papaya", "Orange"};

        System.out.println("Hello World");

        try {
            System.out.println(fruits[8]);
        } catch (Exception e) {
            System.out.println("Exception Handled");
        } finally {
            System.out.println("Finally block always executes");
        }

        System.out.println("Bye World");
    }
}
