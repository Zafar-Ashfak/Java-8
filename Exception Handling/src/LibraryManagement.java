class Library {
    int[] books = { 101, 102, 103, 104, 105};

//    public void borrowBook(int bookId) {
//        try {
//            boolean found = false;
//            for (Integer book : books) {
//                if (book == bookId) {
//                    System.out.println("Book Request: " + book);
//                    found = true;
//                    break;
//                }
//            }
//
//            if (!found) {
//                System.out.println("Book with Id: " + bookId + " not found");
//            }
//
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception :: ArrayIndexOutOfBoundsException Occurred");
//        } catch (NullPointerException n) {
//            System.out.println("Exception :: NullPointerException Occurred");
//        } finally {
//            System.out.println("Finally executes");
//        }
//    }

    public void borrowBook(int bookRequestedCount) throws Exception {
            int availableBooks = 3;
            if (bookRequestedCount > availableBooks) {
                throw new Exception("Book not found");
            }
    }

}

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        try {
            library.borrowBook(161);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
