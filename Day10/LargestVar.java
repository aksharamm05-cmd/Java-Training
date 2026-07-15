public class LargestVar {

    static int largest(int... numbers) {

        int max = numbers[0];

        for (int n : numbers)
            if (n > max)
                max = n;

        return max;
    }

    public static void main(String[] args) {

        System.out.println("Largest = " + largest(12, 45, 7, 90, 35));
    }
}
