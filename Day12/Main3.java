import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(
                Arrays.asList(-2, 1, -3, 4, -1, 2, 1, -5, 4)
        );

        int max = arr.get(0);

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println(max);
    }
}