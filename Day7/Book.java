public class Book {

    String title;

    Book() {
        System.out.println("Book Object Created");
    }

    public static void main(String[] args) {

        Book b = new Book();

        b.title = "Java Programming";

        System.out.println("Book Name : " + b.title);
    }
}