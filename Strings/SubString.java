import java.util.*;
public class SubString {
    public static String substr(String str,int Sp,int Ep){
        String sub = "";
        for(int i = Sp;i<Ep;i++){
            sub = sub + str.charAt(i);
        }
        return sub;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int Sp = sc.nextInt();
        int Ep = sc.nextInt();
        // System.out.print(str.substring(Sp,Ep));
        System.out.println(substr(str,Sp,Ep));
        sc.close();
    }
}
