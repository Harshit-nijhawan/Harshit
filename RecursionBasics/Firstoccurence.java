public class Firstoccurence {
    public static int firstOccur(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }
        if(key == arr[i]){
            return i;
        }
        return firstOccur(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int key = 4;
        System.out.println(firstOccur(arr, key, 0));
    }
}
