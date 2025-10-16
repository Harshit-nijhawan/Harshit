import java.util.*;
public class DP_Basics {
    //recursion
    public static int fib(int n,int dp[]){
        if(n == 0 || n == 1){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = fib(n-1,dp) + fib(n-2,dp);
        return dp[n];
    }

    // Recursion + tabulation
    public static int fibTabulation(int n){
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    // Recursion -----> O(2^n)
    public static int countWays(int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        return countWays(n-1) + countWays(n-2);
    }

    // recursion + Memoization -----> O(n)
    public static int countWays(int n,int ways[]){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(ways[n] != -1){
            return ways[n];
        }

        ways[n] = countWays(n-1) + countWays(n-2);
        return ways[n];
    }

    // count Ways using Tabulation
    public static int countWaysTab(int n){
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i = 1;i<=n;i++){
            if(i == 1){
                dp[i] = dp[i - 1];
            }else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[n];
    }

    // 0-1 Knapsack using recursion
    public static int knapSack(int val[],int weight[],int W,int n){
        if(W == 0 || n == 0){
            return 0;
        }
        if(weight[n-1] <= W){
            // include
            int ans1 = val[n-1] + knapSack(val, weight, W-weight[n-1], n-1);

            //Exclude
            int ans2 = knapSack(val, weight, W, n-1);

            return Math.max(ans1,ans2);
        }else{
            return knapSack(val, weight, W, n-1);
        }
    }

    //0-1 knapsack using memoization
    public static int knapSack(int val[],int weight[],int W,int n,int dp[][]){
        if(W == 0 || n == 0){
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W];
        }
        if(weight[n-1] <= W){
            //Include
            int ans1 = val[n-1] + knapSack(val, weight, W-weight[n-1], n-1,dp);
            
            //Exclude
            int ans2 = knapSack(val, weight, W, n-1 , dp);

            dp[n][W] = Math.max(ans1,ans2);
            return dp[n][W];
        }
        else{
            dp[n][W] = knapSack(val, weight, W, n-1, dp);
            return dp[n][W];
        }
    }

    //0-1 knapsack using tabulation
    public static int knapsackTab(int val[],int weight[],int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        for(int i = 0;i<dp.length;i++){
            dp[i][0] = 0;
        }
        for(int j = 0;j<dp[0].length;j++){
            dp[0][j] = 0;
        }
        for(int i = 1;i<n+1;i++){
            for(int j = 1;j<W+1;j++){
                int v = val[i-1];
                int w = weight[i-1];
                if(w <= j){
                    int incProfit = v + dp[i-1][j-w];
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit,excProfit);
                }
                else{
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        return dp[n][W];
    }

    //target Sum using tabulation
    public static boolean targetSum(int arr[],int sum){
        int n = arr.length;
        boolean dp[][] = new boolean[n+1][sum+1];
        // i = items & j = target sum
        for(int i = 0;i<n+1;i++){
            dp[i][0] = true;
        }
        for(int i = 0;i<n+1;i++){
            for(int j = 1;j<sum+1;j++){
                int v = arr[i-1];
                //include
                if(v <= j && dp[i-1][j-v] == true){
                    dp[i][j] = true;
                }
                //exclude
                else if(dp[i-1][j] == true){
                    dp[i][j] = true;    
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        int n = 5;
        // int dp[] = new int[n+1];
        // int ways[] = new int[n+1];
        // Arrays.fill(ways,-1);
        // System.out.println(fib(n,dp));
        // System.out.println(fibTabulation(n));
        // System.out.println(countWays(n,ways));
        // System.out.println(countWaysTab(n));

        int val[] = {15,14,10,45,30};
        int weight[] = {2,5,1,3,4};
        int W = 7;
        int dp [][] = new int[val.length+1][W+1];
        for(int i = 0;i<dp.length;i++){
            for(int j = 0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
        // System.out.println(knapSack(val, weight, W, val.length));
        // System.out.println(knapSack(val, weight, W, val.length,dp));
        System.out.println(knapsackTab(val,weight,W));
    }
    
}
