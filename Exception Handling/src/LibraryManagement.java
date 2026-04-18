class Libary {
    int[] books = { 101, 102, 103, 104, 105};

    public void borrowBook(int bookId) {
        try {
            boolean found = false;
            for (Integer book : books) {
                if (book == bookId) {
                    System.out.println("Book Request: " + book);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Book with Id: " + bookId + " not found");
            }


        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception :: ArrayIndexOutOfBoundsException Occurred");
        } catch (NullPointerException n) {
            System.out.println("Exception :: NullPointerException Occurred");
        } finally {
            System.out.println("Finally executes");
        }
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Libary libary = new Libary();
        libary.borrowBook(161);
    }
}
