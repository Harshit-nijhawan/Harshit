import java.util.*;
public class Subarray {
    public static void MaxSubArraySum(int numbers[],int num,int arr[]){
        int ts = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<num;i++){
            int start = i;
            for(int j = i;j<num;j++){
                int end = j;
                sum = 0;
                for(int k = start;k<=end;k++){
                    sum = sum + numbers[k];
                }
                ts++;
                System.out.println("sum of subarray is:"+sum);
                if(max<sum){
                    max = sum;
                }
                if(min>sum){
                    min = sum;
                }
            }
        }
        System.out.println("Maximum sum: "+max);
        System.out.println("minimum sum: "+min);
        System.out.println("Toatal subarrays: "+ ts);;
    }
    public static void main(String args[]){
        int numbers[] = new int[100];
        int arr[] = new int [100];
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        for(int i = 0;i<num;i++){
            numbers[i] = sc.nextInt();
        }
        MaxSubArraySum(numbers,num,arr);
        sc.close();

    }
}
