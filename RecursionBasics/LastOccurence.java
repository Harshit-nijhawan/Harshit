public class LastOccurence {
    public static int lastOccur(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        int isfound = lastOccur(arr,key,i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4};
        System.out.println(lastOccur(arr, 2, 0));
    }
}
