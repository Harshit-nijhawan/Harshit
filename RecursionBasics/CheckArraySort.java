public class CheckArraySort {
    public static boolean ArraySort(int arr[],int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return ArraySort(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,10,3,4,5};
        System.out.println(ArraySort(arr,0));
    }
}
