public class SwapArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int i = 1;
        int j = 3;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
