import java.util.Random;

public class Reader {

    public Book choiseBook(Book[] books) {
        Random random = new Random();
        return books[random.nextInt(books.length-1)];
    }

    public String readBook(Book book) {
        return book.toString();
    }

    public int gradeBook(Book book) {

        int grade = 0;
        Random random = new Random();
        if (book.getName() == null) {
            grade = grade - random.nextInt();
        } else {
            grade = grade + book.getName().length();
        }
        if (book.getAuthor() == null) {
            grade = grade - random.nextInt();
        } else {
            grade = grade + book.getAuthor().length();
        }
        if (book.getIndex() == 0) {
            grade = grade - random.nextInt();
        } else {
            grade = grade - book.getIndex();
        }
        if (book.getPagesQty() == 0) {
            grade = grade - random.nextInt();
        } else {
            grade = grade + book.getPagesQty();
        }
        return grade;
    }
}
