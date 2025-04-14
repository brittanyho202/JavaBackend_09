package homework11;

//Question 3
public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Secret Garden", "Frances Hodgson Burnett");
        Book book2 = new Book("The Bad Seed", "Harry To");

        System.out.println("=== Book 1 ===");
        book1.displayInfo();
        book1.borrowBook();  // Borrow
        book1.borrowBook();  // Try borrowing again
        book1.displayInfo();

        System.out.println("\n=== Book 2 ===");
        book2.displayInfo();
        book2.returnBook();  // Try returning before borrowing
        book2.borrowBook();  // Borrow
        book2.returnBook();  // Return
        book2.displayInfo();
    }
}
