package library;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private final Map<Book, Integer> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public void addBook(Book book) {
        Integer amount = books.get(book);
        if (amount == null) {
            this.books.put(book, 1);
        } else {
            this.books.put(book, amount + 1);
        }
    }

    public void addBooks(List<Book> books) {
        for (Book book : books) {
            this.addBook(book);
        }
    }

    public Map<Book, Integer> searchBooksByAuthor(String author) {
        Map<Book, Integer> results = new HashMap<>();
        books.forEach((book, count) -> {
            if (book.author().equals(author)) {
                results.put(book, count);
            }
        });
        return results;
    }
}
