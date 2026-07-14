class Book {

    String title;

    Book(String title) {
        this.title = title;
    }
}

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }
}

class Library {

    void issueBook(Student s, Book b) {

        System.out.println(s.name + " borrowed " + b.title);
    }
}

public class LibraryManagement {

    public static void main(String[] args) {

        Student s = new Student("Akshara");

        Book b = new Book("Java Programming");

        Library l = new Library();

        l.issueBook(s, b);
    }
}
