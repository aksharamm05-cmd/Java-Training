public class PositiveNegativeCount {
    
    public static void main(String[] args) {

        int[] arr = {-2, 5, -1, 8, 3, -7};

        int positive = 0, negative = 0;

        for (int num : arr) {
            if (num >= 0)
                positive++;
            else
                negative++;
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
    }
}

