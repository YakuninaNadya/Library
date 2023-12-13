public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Война и мир", "Толстой Л.Н.",1 ,600);
        Book book2 = new Book("Преступление и наказание", "Достоевский Ф.М.", 2);
        Book book3 = new Book("Братья Карамазовы", 3);
        Book book4 = new Book("Капитанская дочка","Пушкин А.С.");
        Book book5 = new Book();

        Book[] books = new Book[] {book1, book2, book3, book4, book5};

        Reader reader = new Reader();
        Book chosenBook = reader.choiseBook(books);
        System.out.println(reader.readBook(chosenBook));
        System.out.println(reader.gradeBook(chosenBook));

    }
}