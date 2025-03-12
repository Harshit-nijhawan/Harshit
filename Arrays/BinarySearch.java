import java.util.*;
public class BinarySearch {
    public static int binarySearch(int numbers[],int key,int num){
        int start = 0;
        int end = num - 1;
        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
       int numbers[] = new int[100];
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       for(int i = 0;i<num;i++){
        numbers[i]=sc.nextInt();
       }
       int key = sc.nextInt();
       System.out.println("The key is at index " + binarySearch(numbers, key,num));
       sc.close();
    }
}
