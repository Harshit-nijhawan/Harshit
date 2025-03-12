import java.util.*;
public class MonotonicArray {
    public static boolean isMonotonic(ArrayList<Integer> arr,int n){
        boolean inc = true;
        boolean dec = true;
        n = arr.size();
        for(int i = 0;i<n-1;i++){
            if(arr.get(i)>arr.get(i+1)){
                inc = false;
            }
            if(arr.get(i)<arr.get(i+1)){
                dec = false;
            }
        }
        return inc||dec;
    }
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println(isMonotonic(arr,n));
        sc.close();
    }
}
