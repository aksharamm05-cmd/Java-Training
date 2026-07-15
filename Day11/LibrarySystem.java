class Book {
    private int bookId;
    private String title;
    private double price;

    public void setBookId(int bookId) {
        if (bookId > 0) {
            this.bookId = bookId;
        } else {
            System.out.println("Invalid Book ID");
        }
    }

    
    public int getBookId() {
        return bookId;
    }

    
    public void setTitle(String title) {
        if (!title.isEmpty()) {
            this.title = title;
        } else {
            System.out.println("Title cannot be empty");
        }
    }

    
    public String getTitle() {
        return title;
    }

    
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid Price");
        }
    }

   
    public double getPrice() {
        return price;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {

        Book b = new Book();

        b.setBookId(101);
        b.setTitle("Java Programming");
        b.setPrice(599);

        System.out.println("Book ID : " + b.getBookId());
        System.out.println("Title   : " + b.getTitle());
        System.out.println("Price   : " + b.getPrice());
    }
}
