import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> result = new ArrayList<>();

        int[] count = new int[26];

        for (char c : p.toCharArray())
            count[c - 'a']++;

        int left = 0, right = 0, required = p.length();

        while (right < s.length()) {

            if (count[s.charAt(right) - 'a']-- > 0)
                required--;

            right++;

            if (required == 0)
                result.add(left);

            if (right - left == p.length()) {

                if (count[s.charAt(left) - 'a']++ >= 0)
                    required++;

                left++;
            }
        }

        System.out.println(result);
    }
}