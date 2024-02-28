public class Book extends Product{
    private String author;
    @Override
    public double getDiscount() {
        return 2.5;
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }
    public Book() {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
