import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leetcode_171 {
    public static int maximumGain(String s , int x , int y){
        int count = 0 ;
        StringBuilder sb = new StringBuilder(s) ;
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == 'a' && sb.charAt(i+1) == 'b') {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                count += x;
                i = -1; 
            }
        }
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == 'b' && sb.charAt(i+1) == 'a') {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                count += y;
                i = -1;
            }
        }
        return count ;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
        String s = br.readLine(); 
        int x = Integer.parseInt(br.readLine()) ;
        int y = Integer.parseInt(br.readLine()) ;
        System.out.println(maximumGain(s,x,y));
    }
}