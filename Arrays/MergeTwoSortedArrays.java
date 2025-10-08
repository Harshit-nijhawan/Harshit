import java.util.*;
public class MergeTwoSortedArrays {
    public static void sortArray(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int asize = sc.nextInt();
        int arr1[] = new int[asize];
        for(int i = 0;i<asize;i++){
            arr1[i]= sc.nextInt();
        }
        int bsize = sc.nextInt();
        int arr2[] = new int[bsize];        
        for(int i = 0;i<bsize;i++){
            arr2[i]= sc.nextInt();
        }
        sortArray(arr1);
        sortArray(arr2);
        int mergedArray[] = MergeArray(arr1, arr2, asize, bsize);
        for(int i = 0;i<mergedArray.length;i++){
            System.out.print(mergedArray[i]+" ");
        }
    }
    public static int[] MergeArray(int a[],int b[],int asize,int bsize){
        int mergeArr[] = new int[asize+bsize];
        int i = 0,j= 0,k = 0;
        while(i<asize && j < bsize){
            if(a[i]<b[j]){
                mergeArr[k] = a[i];
                k++;
                i++;
            }
            else{
                mergeArr[k] = b[j];
                k++;
                j++;
            }
        }
        while(i<asize){
            mergeArr[k] = a[i];
            k++;
            i++;
        }
        while(j<bsize){
            mergeArr[k] = b[j];
            k++;
            j++;
        }
        return mergeArr;
    }
}
