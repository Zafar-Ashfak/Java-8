//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int num = 10;
//        int res = num / 0;
//        System.out.println(res);
//        System.out.println("Done");
        try {
            int num = 10;
            int res = num / 0;
            System.out.println(res);
            System.out.println("Done");
        } catch (Exception e) {
            System.out.println("Exception occurred");

        }


        int[] arr = {2, 6, 9, 14};
        try {
            System.out.println(arr[5]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception");
        }

        System.out.println("Outside try-catch block");

    }
}