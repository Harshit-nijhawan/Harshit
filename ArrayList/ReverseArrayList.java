import java.util.*;
public class ReverseArrayList {
    public static void Reverse(ArrayList<Integer> arr){
        System.out.print("ArrayList After reverse: ");
        for(int i =arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i)+" ");
        }
    }
    public static void main(String args[]){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            arr.add(sc.nextInt());
        }
        Reverse(arr);
        sc.close();
    }
}
