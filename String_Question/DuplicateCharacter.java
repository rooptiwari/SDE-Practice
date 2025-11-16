package String_Question;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
    public static void duplicateString(String str){
        Map<Character,Integer> countChar   = new HashMap<>();
        for( char ch : str.toCharArray()){
            countChar.put(ch,countChar.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry :  countChar.entrySet()){
            if(entry.getValue() >1){
                System.out.println("char : "+ entry.getKey() + " =>> value: " + entry.getValue());
            }
        }
    }
    public static void main(String[] args) {
        String str = " Roopam";
        duplicateString(str);
    }
}
