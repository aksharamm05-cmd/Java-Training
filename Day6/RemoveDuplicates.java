public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 3, 5};

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {

                    // Shift elements to the left
                    for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }

                    n--;
                    j--; // Check the current position again
                }
            }
        }

        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}