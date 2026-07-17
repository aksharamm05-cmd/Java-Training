public class ThrowDemo {
    public static void main(String[] args) {
        int age = 16;

        try {
            if (age < 18)
                throw new ArithmeticException("Not Eligible");

            System.out.println("Eligible");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program Ended");
    }
}