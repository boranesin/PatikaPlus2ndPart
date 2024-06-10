import java.util.*;

public class Book implements Comparable<Book> {
    private String name;
    private int pageCount;
    private String authorName;
    private String publicationDate;

    public Book(String name, int pageCount, String authorName, String publicationDate) {
        this.name = name;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return name;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public int compareTo(Book other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " (" + pageCount + " Page)";
    }
}