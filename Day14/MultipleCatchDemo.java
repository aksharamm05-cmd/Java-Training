public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = {1,2};
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error");
        }
    }
}