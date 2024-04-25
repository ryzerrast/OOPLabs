import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Calendar;

public class Main {
    private static List<Book> books = new ArrayList<>();
    private static int counter = 0;
    private static Scanner scanner = new Scanner(System.in); // Один Scanner для всього класу

    public static void main(String[] args) {
        createBooks();
        Book defaultBook = new Book();
        Book parameterizedBook = new Book(4, "Назва4", "Автор4", "Видавництво4", 2022, 200, 15.0, false);
        Book copyBook = new Book(parameterizedBook);
        System.out.println("Default book: " + defaultBook);
        System.out.println("Parameterized book: " + parameterizedBook);
        System.out.println("Copy book: " + copyBook);
        System.out.println("\nУсі книги:");
        printBooks(books);
        String author = "Автор1";
        System.out.println("\nСписок книг автора " + author + ":");
        printBooks(filterByAuthor(author));
        String publisher = "Видавництво2";
        System.out.println("\nСписок книг видавництва " + publisher + ":");
        printBooks(filterByPublisher(publisher));
        System.out.println("\nСписок книг, виданих протягом останніх років:");
        filterByRecentYears();
        scanner.close();
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
        System.out.println("Введіть ім'я автора для фільтрації:");
        String inputAuthor = scanner.nextLine();
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equals(inputAuthor)) {
                result.add(book);
            }
        }
        return result;
    }

    private static List<Book> filterByPublisher(String publisher) {
        System.out.println("Введіть назву видавництва для фільтрації:");
        String inputPublisher = scanner.nextLine();
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getPublisher().equals(inputPublisher)) {
                result.add(book);
            }
        }
        return result;
    }

    private static void filterByRecentYears() {
        System.out.println("Введіть кількість років для фільтрації:");
        int inputYears = scanner.nextInt();
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        List<Book> result = new ArrayList<>();
        if (inputYears >= 0) {
            for (Book book : books) {
                if (currentYear - book.getYear() <= inputYears) {
                    result.add(book);
                }
            }
        } else {
            System.out.println("Введене число років має бути додатнім.");
        }
        printBooks(result);
    }
}
