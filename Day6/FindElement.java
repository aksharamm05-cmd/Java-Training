public class FindElement {
    public static void main(String[] args) {

        int[] arr = {5, 8, 10, 20, 15};

        int target = 20;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Target found at index " + i);
                found = true;
                break;
            }
        }

        if (!found)
            System.out.println("Target not found");
    }
}
