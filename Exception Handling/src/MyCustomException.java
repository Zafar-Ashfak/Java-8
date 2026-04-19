import java.util.Scanner;

public class MyCustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        getAge(age);
    }

    public static void getAge(int age) {
        try {
            if (age > 100) {
                throw new CustomException("Your are older than 100 years");
            }
        } catch (Exception e) {
            System.out.println("Exception :: " + e.getMessage());
        }

    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
