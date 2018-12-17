package Shop;

public class Book extends Product{
    private String author;

    public Book (String author, String name, int id, float price) {
        super(id, name, price);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
