public class BuyandSellStocks {
    public static int buy_sell_stocks(int today_price[]){
        int n = today_price.length;
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0;i<n;i++){
            if(buyprice<today_price[i]){
                int profit = today_price[i] - buyprice;
                maxprofit = Math.max(maxprofit,profit);
            }
            else{
                buyprice = today_price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int today_price[] = {7,1,5,3,6,4};
        System.out.println(buy_sell_stocks(today_price));
    }
}
