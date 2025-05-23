import java.util.ArrayList;
import java.util.Arrays;

public class Library {

    Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void addBook(Book book) {
        ArrayList<Book> newBooks = new ArrayList<Book>(Arrays.asList(this.books));
        newBooks.add(book);
        this.books = newBooks.toArray(new Book[0]);
    }

    public void removeBook(String isbn) {
        for (int i = 0; i < this.books.length; ++i) {
            if (books[i].getISBN().equals(isbn)) {
                ArrayList<Book> newBooks = new ArrayList<Book>(Arrays.asList(this.books));
                newBooks.remove(i);
                this.books = newBooks.toArray(new Book[0]);
                return;
            }
        }
    }

    public Book[] searchBook(String title) {
        ArrayList<Book> matches = new ArrayList<Book>(0);
        for (int i = 0; i < this.books.length; ++i) {
            if (books[i].getTitle().equals(title)) matches.add(books[i]);
        }
        return matches.toArray(new Book[0]);
    }

    public Book[] displayBooks() {
        return this.books;
    }

}