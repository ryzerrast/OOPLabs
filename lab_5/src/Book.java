class Book {
    private static int counter = 0;
    private Integer id;
    private String title;
    private String author;
    private String publisher;
    private Integer year;
    private Integer pageCount;
    private Double price;
    private Boolean audioAvailable;

    public Book() {
        id = ++counter;
    }

    public Book(Integer id, String title, String author, String publisher, Integer year, Integer pageCount, Double price, Boolean audioAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pageCount = pageCount;
        this.price = price;
        this.audioAvailable = audioAvailable;
    }

    public Book(Book other) {
        this.id = other.id;
        this.title = other.title;
        this.author = other.author;
        this.publisher = other.publisher;
        this.year = other.year;
        this.pageCount = other.pageCount;
        this.price = other.price;
        this.audioAvailable = other.audioAvailable;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getAudioAvailable() {
        return audioAvailable;
    }

    public void setAudioAvailable(Boolean audioAvailable) {
        this.audioAvailable = audioAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", pageCount=" + pageCount +
                ", price=" + price +
                ", audioAvailable=" + audioAvailable +
                '}';
    }
}