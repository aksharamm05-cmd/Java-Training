import java.util.HashMap;

public class ContainsDuplicate {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        boolean found = false;

        for (int num : nums) {

            if (map.containsKey(num)) {
                found = true;
                break;
            }

            map.put(num, 1);
        }

        System.out.println(found);
    }
}