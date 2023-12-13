public class Book {

    private String name;
    private String author;
    private int index;
    private int pagesQty;

    public Book(String name, String author, int index, int pagesQty) {
        this.name = name;
        this.author = author;
        this.index = index;
        this.pagesQty = pagesQty;
    }

    public Book() {

    }

    public Book(String name, String author, int index) {
        this.name = name;
        this.author = author;
        this.index = index;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name, int index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getIndex() {
        return index;
    }

    public int getPagesQty() {
        return pagesQty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", index=" + index +
                ", pagesQty=" + pagesQty +
                '}';
    }
}
