import java.util.HashMap;

public class FirstUniqueCharacter {

    public static void main(String[] args) {

        String s = "leetcode";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                System.out.println("Index = " + i);
                return;
            }
        }

        System.out.println(-1);
    }
}
