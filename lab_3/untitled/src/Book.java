public class Book {
    private Integer id;
    private String title;
    private String author;
    private String publisher;
    private Integer year;
    private Integer pageCount;
    private Double price;
    private Boolean audioAvailable;

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

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public Double getPrice() {
        return price;
    }

    public Boolean getAudioAvailable() {
        return audioAvailable;
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
