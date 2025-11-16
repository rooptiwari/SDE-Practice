package String_Question;
import javax.print.DocFlavor;

public class ShiftAllSpcaeLeft {
    public static String shiftSpaceLeft(String s ){
        StringBuilder space = new StringBuilder();
        int countSpace = 0;
        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                countSpace++;
            }
        }
        for(int i = 0 ; i < countSpace; i++){
            space.append(' ');
        }
        StringBuilder RS = new StringBuilder();
        for( int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                RS.append(s.charAt(i));
            }
        }
        return space.append(RS).toString();
    }
    public static void main(String[] args){
        String s = " Roopam is  my name_ ";
        String r = shiftSpaceLeft(s);
        System.out.println(r);
    }
}
