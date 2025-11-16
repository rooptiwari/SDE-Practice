package String_Question;

public class CheckPallindrome {
    public static boolean isPalindrome(String str){
        int start = 0;
        int last = str.length()-1;
        while (start < last){
            if(str.charAt(start) != str.charAt(last)){
                return false;
            }
            start++;   last--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "RoopamRich";
        System.out.println(isPalindrome(str));
    }
}
