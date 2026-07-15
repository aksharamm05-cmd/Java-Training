class Person1 {

    void display() {
        System.out.println("I am a Person");
    }
}

class Student extends Person1 {

    @Override
    void display() {
        System.out.println("I am a Student");
    }
}

public class Person2 {

    public static void main(String[] args) {

        Person1 p = new Student();

        p.display();
    }
}
