public class Calucator {

    int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {

        
     Calucator c = new Calucator();

        System.out.println("Addition = " + c.add(10, 20));
        System.out.println("Multiplication = " + Calucator.multiply(10, 20));
    }
}