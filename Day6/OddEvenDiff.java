public class OddEvenDiff {
    public static void main(String[] args) {

        int[] arr = {2, 5, 8, 3, 6, 1};

        int oddSum = 0;
        int evenSum = 0;

        for (int num : arr) {

            if (num % 2 == 0)
                evenSum += num;
            else
                oddSum += num;
        }

        System.out.println("Difference = " + Math.abs(oddSum - evenSum));
    }
}
