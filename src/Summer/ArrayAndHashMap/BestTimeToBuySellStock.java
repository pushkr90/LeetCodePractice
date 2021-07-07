package Summer.ArrayAndHashMap;

public class BestTimeToBuySellStock {
    public int maxProfit(int[] prices) {
        int profit=0;
        int minBuyPrice=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<minBuyPrice)
            {
                minBuyPrice=Math.min(minBuyPrice,prices[i]);
            }
            profit=Math.max(profit,prices[i]-minBuyPrice);


        }
        return profit;

    }
}
