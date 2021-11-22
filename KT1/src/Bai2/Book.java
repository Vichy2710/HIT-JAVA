package Bai2;

import java.util.Scanner;

public class Book extends Document{
    Scanner input = new Scanner(System.in);

    private long numberOfPage;
    private String author;

    @Override
    public String toString() {
        return "Book{" +
                "numberOfPage=" + numberOfPage +
                ", author='" + author + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
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
