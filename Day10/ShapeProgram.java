abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    @Override
    void area() {
        double r = 5;
        System.out.println("Circle Area = " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    @Override
    void area() {
        System.out.println("Rectangle Area = " + (6 * 4));
    }
}

public class ShapeProgram {
    public static void main(String[] args) {

        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}
