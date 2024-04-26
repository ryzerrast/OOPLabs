import java.time.LocalDate;

abstract class Base {
    protected static int counter = 0;
    protected Integer id;
    protected String lastName;
    protected String firstName;
    protected String middleName;
    protected String phoneNumber;
    protected LocalDate hiredDate;

    // Конструктор по замовчуванню
    public Base() {
        this.id = ++counter;
    }

    // Параметризований конструктор
    public Base(Integer id, String lastName, String firstName, String middleName, String phoneNumber, LocalDate hiredDate) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.phoneNumber = phoneNumber;
        this.hiredDate = hiredDate;
    }

    // Конструктор копіювання
    public Base(Base other) {
        this.id = other.id;
        this.lastName = other.lastName;
        this.firstName = other.firstName;
        this.middleName = other.middleName;
        this.phoneNumber = other.phoneNumber;
        this.hiredDate = other.hiredDate;
    }

    // Гетери і сетери для всіх атрибутів
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(LocalDate hiredDate) {
        this.hiredDate = hiredDate;
    }
}
