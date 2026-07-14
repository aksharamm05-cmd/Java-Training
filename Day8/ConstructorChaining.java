public class ConstructorChaining {

    ConstructorChaining() {
        this(100);
        System.out.println("Default Constructor");
    }

    ConstructorChaining(int x) {
        this("Java");
        System.out.println("Parameterized Constructor: " + x);
    }

    ConstructorChaining(String name) {
        System.out.println("String Constructor: " + name);
    }

    public static void main(String[] args) {
        new ConstructorChaining();
    }
}
