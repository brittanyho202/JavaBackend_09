package homework11;

// Question 3
public class Book {
	// Colors for output
	public static final String RESET = "\u001B[0m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
    private String title;
    private String author;
    private String status;	// "Available" or "Borrowed"

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.status = "Available";
    }

    public void borrowBook() {
        if (status.equals("Available")) {
            status = "Borrowed";
            System.out.println(GREEN + "You have successfully borrowed \"" + title + "\"." + RESET);
        } else {
            System.out.println(RED + "Error: Sorry, \"" + title + "\" is currently not available." + RESET);
        }
    }

    public void returnBook() {
        if (status.equals("Borrowed")) {
            status = "Available";
            System.out.println(GREEN + "You have successfully returned \"" + title + "\"." + RESET);
        } else {
            System.out.println(RED + "\"" + title + "\" was not borrowed." + RESET);
        }
    }

    public void displayInfo() {
        System.out.println("\tTitle: " + title);
        System.out.println("\tAuthor: " + author);
        System.out.println("\tStatus: " + status);
    }
}
