public class Rectanglee {

    int length;
    int breadth;

    Rectanglee(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int area() {
        return length * breadth;
    }

    int perimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {

        Rectanglee r = new Rectanglee(10, 5);

        System.out.println("Area = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
    }
}