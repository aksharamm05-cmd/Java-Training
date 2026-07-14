public class BookStore {

    String title;
    String author;
    double price;

    BookStore(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Book: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        BookStore b1 = new BookStore("Java", "James", 450);
        BookStore b2 = new BookStore("Python", "Guido", 500);

        b1.display();
        System.out.println();
        b2.display();
    }
}
