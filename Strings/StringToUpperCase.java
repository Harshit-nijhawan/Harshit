import java.util.*;
public class StringToUpperCase {
    public static String toUpper(String str){
        String newString = "";
        newString = newString+Character.toUpperCase(str.charAt(0));

        for(int i = 1;i<str.length();i++){
            if(str.charAt(i-1)==' ' && i<str.length()-1){
                newString = newString + Character.toUpperCase(str.charAt(i));
            }
            else{
                newString = newString+str.charAt(i);
            }
        }
        return newString;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(toUpper(str));
        sc.close();
    }
}
