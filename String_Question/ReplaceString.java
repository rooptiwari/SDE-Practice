package String_Question;

public class ReplaceString {

    public static String replcae(String str , String target , String replaced){
        int n = str.indexOf(target);
        StringBuilder result = new StringBuilder();
        result.append(str,0,n);
        result.append(replaced);

        int rl = n+target.length();
        result.append(str,rl,str.length());

        return result.toString();
    }

    public static void main(String[] args) {
        String str = "RoopamTiwari";
        String target = "oo";
        String replaced = "K";
        String ans = replcae(str,target,replaced);
        System.out.println(ans);

    }
}
