import java.util.*;
public class TwiceElementInArray {
    public static boolean CheckElementOccurance(int arr[],int num){
        int n = num;
        for(int i = 0;i<n;i++){
            int start = arr[i];
            for(int j = i+1;j<n;j++){
                if(start == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = new int[100];
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(CheckElementOccurance(arr,num));
        sc.close();
    }
}
