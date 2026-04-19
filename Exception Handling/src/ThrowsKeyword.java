public class ThrowsKeyword {

    public static int getElement(int[] arr) throws ArrayIndexOutOfBoundsException {
        return arr[8];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6};
        System.out.println("Hello Bro");
        try {
            System.out.println(getElement(arr));

        } catch (Exception e) {
            System.out.println("Exception :: " + e.getMessage());
        }
    }
}
