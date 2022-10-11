package library;

import java.util.Arrays;

public record Book(String title, String author, String publisher,
                   Genre genre, int publicationYear) {

    @Override
    public String toString() {
        return this.title + ", " + this.author;
    }
}

enum Genre {
    FANTASY("Fantasy"),
    HISTORICAL_NON_FICTION("Historical non-fiction");

    private final String text;

    Genre(String text) {
        this.text = text;
    }

    public static Genre fromText(String text) {
        return Arrays.stream(values())
                .filter(bl -> bl.text.equalsIgnoreCase(text))
                .findFirst().get();
    }
}
