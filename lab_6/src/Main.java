import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    private static Librarian[] librarians = new Librarian[4];

    public static void main(String[] args) {
        ArrayList<String> books1 = new ArrayList<>();
        books1.add("Book1");
        books1.add("Book2");
        ArrayList<String> books4 = new ArrayList<>();
        books4.add("Book4");
        ArrayList<String> books2 = new ArrayList<>();
        books2.add("Book2");

        Librarian librarian1 = new Librarian();
        Librarian librarian2 = new Librarian(2, "Dyadchenko", "Ivanka", "Ivanivna", "+380987654321",
                LocalDate.of(2024, 2, 27), "Female", "dyadchenko@example.com", books1);
        Librarian librarian3 = new Librarian("Gordienko", "Dmytro", "Dmytrovych");
        Librarian librarian4 = new Librarian(librarian2);

        librarians[0] = librarian1;
        librarians[1] = librarian2;
        librarians[2] = librarian3;
        librarians[3] = librarian4;

        for (int i = 0; i < 4; i++) {
            if (librarians[i] != null) {
                System.out.println(librarians[i]);
            }
        }

        // Перелік книг, взятих у бібліотеці заданим читачем (a)
        System.out.println("\nBooks taken by librarian2: " + librarian2.getBorrowedBooks());

        // Перелік читачів бібліотеки, які більше року не відвідували бібліотеку (b)
        for (Librarian librarian : librarians) {
            if (librarian != null && librarian.daysSinceLastVisit() > 365) {
                System.out.println("\nLibrarian who hasn't visited the library for more than a year: " + librarian);
            }
        }

        // Перелік читачів бібліотеки, які мають прецеденти прострочення терміну взяття книги (c)
        for (Librarian librarian : librarians) {
            if (librarian != null && librarian.hasOverdueBooks()) {
                System.out.println("\nLibrarian with overdue books: " + librarian);
            }
        }
    }
}
