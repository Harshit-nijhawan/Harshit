import java.util.*;
public class classWork {
    public static void printNum1toN(int n){
        if(n == 1){
            System.out.print(1+" ");
            return;
        }
        
        System.out.print(n+" ");;
        printNum1toN(n - 1);
    }
    public static void printNumNto1(int n){
        if(n == 1){
            System.out.print(n+" ");
            return;
        }
        printNumNto1(n-1);
        System.out.print(n+" ");
    }
    public static int fact(int n){
        if(n==0|| n==1){
            return 1;
        }
        return n * fact(n-1);
    }
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter number to print Number from N to 1");
        printNumNto1(num);
        System.out.println("Enter number to print from 1 to N");
        printNum1toN(num);
        System.out.println("Enter number to check is it Factorial of Number");
        fact(num);
        // System.out.println("Enter number to check is it Fibonacci Number or Not");
        // fibonacciNumber(num);
        System.out.println("Enter a number upto which you want Fibonacci Series");
        fib(num);
    }
}
