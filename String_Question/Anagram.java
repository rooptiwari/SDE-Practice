package String_Question;

import DP.CharyPick;

import java.util.Map;

public class Anagram {
    public static boolean isAnagram (String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        int [] charCount = new int[26];
        for(int i = 0; i<str1.length();i++){
            charCount[str1.charAt(i) - 'a']++;
            charCount[str2.charAt(i) - 'a']--;
        }
        for(int i = 0; i < charCount.length; i++){
            if(charCount[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println(isAnagram(s1,s2));

    }
}
