import java.util.*;
public class SwapNumbers {
    public static void swap(ArrayList <Integer> arr,int index1,int index2){
        int temp = arr.get(index1);
        arr.set(index1,arr.get(index2));
        arr.set(index2,temp);
    }
    public static void main(String args[]){
        ArrayList<Integer> arr= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            arr.add(sc.nextInt());
        }
        System.out.println("Enter index1 which you want to swap: ");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        swap(arr,index1,index2);
        System.out.print("ArrayList After swap: ");
        for(int i = 0;i<n;i++){
            System.out.print(arr.get(i)+" ");
        }
        sc.close();
    }
}
