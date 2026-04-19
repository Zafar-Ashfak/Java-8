import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Hello Devs");

        try {
            int res = 10/ 0;
            System.out.println(nums[8]);

        } catch (ArithmeticException e) {
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
            System.out.println(e);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Tried to access an element that exceeded the length of the array");
        }

        System.out.println("Bye Devs");
    }
}