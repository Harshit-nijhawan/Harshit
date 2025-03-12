public class OptimisedPower {
    public static int Optipow(int x,int n){
        if(n==0){
            return 1;
        }
        int halfpower = Optipow(x, n/2);
        int halfPowerSq = halfpower * halfpower;

        if(n%2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        System.out.println(Optipow(2, 5));
    }
}
