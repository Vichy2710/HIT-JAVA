package Bai2;

public class Book extends Document{
    private long numberOfPage;
    private String author;
    public Book(){
        super();
    }
    public Book(String id, String name, String publisher, double price,long numberOfPage, String author) {
        super(id, name, publisher, price);
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                " id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                ", numberOfPage=" + numberOfPage +
                ", author='" + author + '\'' +
                '}' +"\n";
    }

    public long getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(long numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
