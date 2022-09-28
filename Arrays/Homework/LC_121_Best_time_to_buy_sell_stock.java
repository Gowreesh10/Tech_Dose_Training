package Arrays.Homework;

public class LC_121_Best_time_to_buy_sell_stock {
    public int maxProfit(int[] prices) {

        int profit=0,loss=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<loss)
                loss=prices[i];
            else if(prices[i]-loss>profit)
                profit=prices[i]-loss;
        }
        return profit;

        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[j]>=prices[i]&&prices[j]-prices[i]>profit){
        //             profit=prices[j]-prices[i];
        //         }
        //     }
        // }                        Time Limit Exceeded
        // return profit;

    }
}
