public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "Derek Noah", "1234567890");
        Book book2 = new Book("Python Basics", "Walter White", "0987654321");

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();
    }
}