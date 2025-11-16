package String_Question;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static String removeDuplicate(String str){
        HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "Roopam";
        System.out.println(removeDuplicate(str));
    }
}
