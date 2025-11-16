package String_Question;

import java.util.HashMap;

public class LongestSubstringOptimized {
    public static String longestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0, start = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            // If duplicate found, move left pointer beyond its last occurrence
            if (map.containsKey(ch)) {
                left = Math.max(map.get(ch) + 1, left);
            }
            // Store the last occurrence of character
            map.put(ch, right);
            // Update max length and start position
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }
        return s.substring(start, start + maxLength);
    }
    public static void main(String[] args) {
        String input = "abcadc";
        String longestSubstr = longestSubstring(input);
        System.out.println("Longest substring: " + longestSubstr);
        System.out.println("Length: " + longestSubstr.length());
    }
}