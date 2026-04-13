
// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it
package stream_api;

public class AddDigits {
    public static int addDigits(int num) {
        return num % 9 == 0 ? 9 : num % 9;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(85771));
    }
}
