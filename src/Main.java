import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите выражение:");
        Scanner scanner=new Scanner(System.in);
        String s= scanner.next();
        System.out.println(isExpression(s,0));
    }

    public static boolean isLetter(char c){
        if ((c>='a' && c<='z') || (c>='A' && c<='Z')) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isOperation(char c){
        if (c=='-' || c=='+' || c=='*') {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isExpression(String s, int pos){
        char c=s.charAt(pos);
        if (pos==0){
           if(isLetter(c)) {
               return isExpression(s, pos + 1);
           }  else {
               return false;
           }
        }
        else
        if (pos<s.length()-1){
            if (isLetter(c)){
                return isExpression(s, pos+1);
            }
            if (isOperation(c)){
                return isExpression(s, pos+1);
            }
            else {
                return false;
            }
        }
        else {
            if (isOperation(c)){
                return false;
            }
        }
        return true;
    }

}
