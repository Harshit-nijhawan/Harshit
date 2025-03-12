public class PrintNumbers {
    public static void PrintDecOrder(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        PrintDecOrder(n-1);
    }
    public static void PrintIncOrder(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        PrintIncOrder(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        // PrintDecOrder(10);
        PrintIncOrder(10);
        
    }
}
