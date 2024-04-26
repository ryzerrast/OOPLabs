import java.util.ArrayList;
import java.util.List;


public class Main {
    private static List<Book> books = new ArrayList<>();

    public static void main(String[] args) {
        createBooks();
        System.out.println("Усі книги:");
        printBooks(books);
        String author = "Автор1";
        System.out.println("\nСписок книг автора " + author + ":");
        printBooks(filterByAuthor(author));
        String publisher = "Видавництво2";
        System.out.println("\nСписок книг видавництва " + publisher + ":");
        printBooks(filterByPublisher(publisher));
        int currentYear = 2024;
        System.out.println("\nСписок книг, виданих протягом останніх трьох років:");
        printBooks(filterByRecentYears(currentYear - 3));
    }

    private static void createBooks() {
        books.add(new Book(1, "Назва1", "Автор1", "Видавництво1", 2022, 300, 25.5, true));
        books.add(new Book(2, "Назва2", "Автор2", "Видавництво2", 2020, 250, 30.0, false));
        books.add(new Book(3, "Назва3", "Автор1", "Видавництво1", 2023, 400, 20.0, true));
    }

    private static void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    private static List<Book> filterByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }

    private static List<Book> filterByPublisher(String publisher) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                result.add(book);
            }
        }
        return result;
    }

    private static List<Book> filterByRecentYears(int year) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() >= year) {
                result.add(book);
            }
        }
        return result;
    }
}
