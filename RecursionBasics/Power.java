public class Power {
    public static int Ans(int x,int n){
        if(n==0){
            return 1;
        }
        return x * Ans(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(Ans(2,5));
    }
}
