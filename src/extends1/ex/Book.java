package extends1.ex;

public class Book  extends Item{
    String author;
    String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        System.out.println("이름:" + name + ", 가격:" + price);
        System.out.println("- 저자:" + author + ", isbn:" + isbn);
    }
}
