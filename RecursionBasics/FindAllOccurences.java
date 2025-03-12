public class FindAllOccurences {
    public static void Find(int arr[],int key,int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i+" ");
        }
        Find(arr,key,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,2,5,4,2};
        int key = 2;
        Find(arr,key,0);
    }
}
