package in.piyush;

class Book {
    static int totalNoOfBooks;
    String name;
    String author;
    String title;
    static String isbn;
    Boolean isBorrowed;

    static {
        totalNoOfBooks = 0;
    }

    {
        totalNoOfBooks++;
    }

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    Book(String isbn) {
        this(isbn, "Unknown", "Unknown ");
    }


    static int getTotalNoOfBooks() {
        return totalNoOfBooks;
    }

    void borrowBook() {
        if (isBorrowed = false) {
            System.out.println("in.piyush.Book is already borrowed");
        } else {
            this.isBorrowed = true;
            System.out.println("in.piyush.Book borrowed successfully");
        }

    }

    void returnBook() {
        if (isBorrowed = true) {
            System.out.println("Hope You enjoyed the book, Please leave a review");
        } else {
            System.out.println("THis in.piyush.Book is already in the Library");
            isBorrowed = false;
        }
    }

    public static void main(String[] args) {
        Book designOfThings = new Book("1", "Design", "Author");
        Book myBook = new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.borrowBook();
        myBook.borrowBook();
        myBook.returnBook();
    }
}