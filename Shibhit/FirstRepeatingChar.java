package Shibhit;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

//  my naame is roopam
public class FirstRepeatingChar {
    public static void main(String[] args) {
        String sentence = "my name is roopam";

        // Step 1: Initialize a LinkedHashMap to store characters and their counts
        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Step 2: Iterate over the sentence character by character
        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);
            // Step 3: Ignore spaces
            if (currentChar == ' ') {
                continue;
            }
            // Step 4: Count & store charCountMap in the occurrences of each character

            charCountMap.put(currentChar,  charCountMap.getOrDefault(currentChar, 0)     + 1);
        }
        // Step 5: Find the first character that is repeated
        for (char ch : charCountMap.keySet()) {
            if (charCountMap.get(ch) == 1) {
                System.out.println("First duplicate character: " + ch);
                return; // Exit after finding the first duplicate character
            }

            // Count of each character
            // System.out.println(ch + " : " + charCountMap.get(ch));

        }

        // If no duplicate character is found
        System.out.println("No duplicate character found");
    }
}