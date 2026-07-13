public class SumTwoArray {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {5, 6, 7, 8};

        int[] sum = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            sum[i] = a[i] + b[i];
        }

        System.out.print("Sum Array: ");

        for (int num : sum) {
            System.out.print(num + " ");
        }
    }
}
