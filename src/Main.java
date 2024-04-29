public class Main {
    public static void main(String[] args) {
  Checkout book1 = new Checkout("Daisy", "48273683","Java Programming", "Derek Noah", "1234567890");
 Checkout book2 = new Checkout("Dave", "46748627","Python Basics", "Walter White", "0987654321");
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.displayBooks();
    }
}
