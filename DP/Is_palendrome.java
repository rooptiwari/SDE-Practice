package DP;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Is_palendrome {

    public static boolean isPallendrome(String s){

        int left = 0;
        int right = s.length()-1;

        while (left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static List<String> allPallendromeSubstring(String s){

        List<String> str = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            for(int j = i+2; j < s.length(); j++){
                String substring = s.substring(i, j);
                if(isPallendrome(substring)){
                    str.add(substring);
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        String str = "MMM";
        List<String> ans =allPallendromeSubstring(str);
        System.out.println("Palindrome Substrings:");
        for(String s : ans){
            System.out.println(s);
        }
    }
}
