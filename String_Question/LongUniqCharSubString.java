package String_Question;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongUniqCharSubString {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static String LSNRC(String str){

        Map<Character,Integer> count = new HashMap<>();
        int left = 0, maxLength = 0, start = 0;
        for( int right = 0 ; right < str.length(); right++){
            char ch = str.charAt(right);
            while(count.containsKey(ch)){
                left = Math.max(count.get(ch) + 1, left);
            }
            count.put(ch,right);
            if(right-left+1 > maxLength){
                maxLength = right-left+1;
                start = left;
            }
        }
        return str.substring(start,start+maxLength);

    }

    public static String maxSubstringNR(String str){
        boolean [] seen = new boolean[256];
        StringBuilder ans = new StringBuilder();
        int start = 0, maxLen = 0 , left = 0;
        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            while(seen[ch]){
                seen[str.charAt(left)] = false;
                left++;
            }
            seen[ch] = true;
            if(i-left+1 > maxLen){
                maxLen = i-left+1;
                start = left;
            }
        }
        return str.substring(start,start+maxLen);
    }
    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println("Length of longest substring: " + maxSubstringNR(input));
    }
}