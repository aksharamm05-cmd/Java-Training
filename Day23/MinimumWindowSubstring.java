public class MinimumWindowSubstring {

    public static void main(String[] args) {

        String s = "ADOBECODEBANC";
        String t = "ABC";

        int[] map = new int[128];

        for (char c : t.toCharArray())
            map[c]++;

        int left = 0;
        int right = 0;
        int count = t.length();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {

            if (map[s.charAt(right)] > 0)
                count--;

            map[s.charAt(right)]--;
            right++;

            while (count == 0) {

                if (right - left < minLen) {
                    minLen = right - left;
                    start = left;
                }

                map[s.charAt(left)]++;

                if (map[s.charAt(left)] > 0)
                    count++;

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE)
            System.out.println("");

        else
            System.out.println(s.substring(start, start + minLen));

    }
}