package INterviewQuestion;

import javax.sound.midi.Soundbank;

public class reverseString {
    public static String reverse(String s){
        StringBuilder str = new StringBuilder();
        for(char c : s.toCharArray()) {
            if(c != '-'){
                str.append(c);
            }
        }
        int a = 0;
        str.reverse();
        StringBuilder result = new StringBuilder();

        for( int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '-'){
                result.append(str.charAt(a));
                a++;
            }else{
                result.append('-');
            }
        }
        return new String(result);
    }

    public static String reversWithoutSB(String s ){

        char [] str = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            if(!Character.isLetter(str[left])){
                left++;
            }else if(!Character.isLetter(str[right])){
                right--;
            }else {
                char tmp = str[left];
                str[left] = str[right];
                str[right]= tmp;
                left++;
                right--;
            }
        }
        return new String(str);
    }
    public static void main(String[] args) {
        String str = "R-oo-pam-Tiwari";
        String ans = reversWithoutSB(str);
        System.out.println(str);
        System.out.println(ans);


    }
}
