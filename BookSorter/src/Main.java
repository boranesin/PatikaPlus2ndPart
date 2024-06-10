import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Book> booksByName = new TreeSet<>();
        booksByName.add(new Book("Book A", 200, "Author X", "2020"));
        booksByName.add(new Book("Book C", 150, "Author Y", "2021"));
        booksByName.add(new Book("Book B", 300, "Author Z", "2019"));
        booksByName.add(new Book("Book E", 100, "Author W", "2018"));
        booksByName.add(new Book("Book D", 250, "Author V", "2022"));

        System.out.println("Books sorted by name:");
        for (Book book : booksByName) {
            System.out.println(book);
        }

        Set<Book> booksByPageCount = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.getPageCount(), o2.getPageCount());
            }
        });

        booksByPageCount.addAll(booksByName);

        System.out.println("\nBooks sorted by page count:");
        for (Book book : booksByPageCount) {
            System.out.println(book);
        }
    }
}