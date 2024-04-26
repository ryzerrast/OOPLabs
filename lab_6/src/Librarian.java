import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

class Librarian extends Base {
    // Додаткові атрибути бібліотекаря
    private String gender;
    private String email;
    private ArrayList<String> borrowedBooks;
    private LocalDate lastVisitDate;


    // Конструктор по замовчуванню
    public Librarian() {
        super();
        this.gender = "";
        this.email = "";
        this.borrowedBooks = new ArrayList<>();
        this.lastVisitDate = LocalDate.now();
    }

    // Параметризований конструктор
    public Librarian(Integer id, String lastName, String firstName, String middleName, String phoneNumber, LocalDate hiredDate,
                     String gender, String email, ArrayList<String> borrowedBooks) {
        super(id, lastName, firstName, middleName, phoneNumber, hiredDate);
        this.gender = gender;
        this.email = email;
        this.borrowedBooks = borrowedBooks;
        this.lastVisitDate = LocalDate.now(); // Початкова дата вважається поточною датою
    }

    // Конструктор копіювання
    public Librarian(Librarian other) {
        super(other);
        this.gender = other.gender;
        this.email = other.email;
        this.borrowedBooks = new ArrayList<>(other.borrowedBooks);
        this.lastVisitDate = other.lastVisitDate;
    }

    public long daysSinceLastVisit() {
        return ChronoUnit.DAYS.between(lastVisitDate, LocalDate.now());
    }

    // Доданий конструктор, що приймає три рядки (прізвище, ім'я, по батькові)
    public Librarian(String lastName, String firstName, String middleName) {
        super();
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.gender = "";
        this.email = "";
        this.borrowedBooks = new ArrayList<>();
    }

    public boolean hasOverdueBooks() {
        LocalDate today = LocalDate.now();
        for (String book : borrowedBooks) {
            LocalDate dueDate = LocalDate.parse(book.getDueDate());
            if (dueDate.isBefore(today)) {
                return true; // Є прострочена книга
            }
        }
        return false; // Прострочених книг немає
    }

    // Гетери і сетери для додаткових атрибутів
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<String> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<String> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", hiredDate=" + hiredDate +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", borrowedBooks=" + borrowedBooks +
                '}';
    }
}