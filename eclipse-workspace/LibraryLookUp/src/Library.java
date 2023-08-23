import java.util.ArrayList;


public class Library {
    // Add the missing implementation to this class
	
	private String address;
	private ArrayList<Book> bookCollection = new ArrayList<>();
	private static final String HOURS_OF_OPERATION = " Mon - Fri 9am to 5pm";
	
	public Library(String address) {
		this.address = address;
	}
	
	public void addBook(Book newBook) {
		bookCollection.add(newBook);
	}
	
	public static void printOpeningHours() {
		System.out.println("Library hours are from" + HOURS_OF_OPERATION);
	}
	
	public void printAddress() {
		System.out.println(address);
	}
	
	public void borrowBook(String bookTitle) {
		for(Book books : bookCollection) {
			if(books.title.equals(bookTitle)) {
				if(!books.isBorrowed()) {
					books.borrowed();
					System.out.println("You successfully borrowed " + bookTitle);
					return;
				} else {
					System.out.println("Sorry, this book is already borrowed.");
					return;
				}
				
			}
		}
		System.out.println("Sorry, this book is not in our catalog.");
	}
	
	public void printAvailableBooks() {
		for(int i = 0; i < bookCollection.size(); i++) {
			if(!bookCollection.get(i).isBorrowed()) {
				System.out.println(bookCollection.get(i).getTitle());
			}
		}
	}
	
	public void returnBook(String newBook) {
		for(int i = 0; i < bookCollection.size(); i++) {
			if(bookCollection.get(i).getTitle().equals(newBook) && bookCollection.get(i).isBorrowed()) {
				bookCollection.get(i).returned();
				System.out.printf("You successfully returned %s", newBook );
			}
		}
	}

    public static void main(String[] args) {
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
        firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
    }
}