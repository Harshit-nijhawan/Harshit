import java.util.*;
public class LargestNumber {
    public static void main(String agrs[]){
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        for(int i = 0;i<num;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;i<num;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println(largest+" is Largest");
        System.out.println(smallest+" is smallest");
        sc.close();
    }
}
