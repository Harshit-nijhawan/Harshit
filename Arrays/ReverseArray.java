import java.util.*;

public class ReverseArray {
    public static void reverse(int numbers[],int num){
        int start = 0;
        int end = num - 1;
        while(start<end){
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;
            start++;
            end--;
        }
       
    }
    public static void main(String args[]){
        int numbers[] = new int[100];
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0;i<num;i++){
            numbers[i] = sc.nextInt();
        }
        reverse(numbers, num);
        for(int i =0;i<num;i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        sc.close();
    }
}
