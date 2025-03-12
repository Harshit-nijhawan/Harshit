import java.util.*;
public class PairSum1 {
    public static boolean pairsum1(ArrayList<Integer> List1,int target){
        // for(int i =0;i<List1.size();i++){
        //     for(int j=i+1;j<List1.size();j++){
        //         if(List1.get(i) + List1.get(j)==target){
        //             return true;
        //         }
        //     }
        // }
        // return false;


        //                  OR

        // 2 Pointer Approach having Time complexity O(n)


        int lp = 0;
        int rp = List1.size() - 1;
        while(lp<rp){
            if(List1.get(lp) + List1.get(rp) == target){
                return true;
            }
            else if(List1.get(lp) + List1.get(rp) < target){
                lp++;
            }
            else{
                rp--;
            }
            
        }
        return false;


    }
    public static void main(String[] args) {
        ArrayList<Integer> List1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in Array: ");
        int n = sc.nextInt();
        System.out.print("Enter number of elements in sorted order: ");
        for(int i = 0;i<n;i++){
            List1.add(sc.nextInt());
        }
        System.out.print("Enter target: ");;
        int target = sc.nextInt();
        System.out.print(pairsum1(List1,target));
        sc.close();
    }
}
