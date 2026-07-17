public class NestedTryDemo {

    public static void main(String[] args) {

        try {

            try {
                int a = 10 / 0;
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch");
            }

            int[] arr = {1,2};
            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Catch");
        }

    }
}