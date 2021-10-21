package Summer.google;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount)
    {
        int [] visited=new int[amount+1];
        Arrays.fill(visited,-1);

        return dfs(coins,amount,visited);

    }

    private int dfs(int[] coins,int amount,int[]visited)
    {
        if(amount==0) return 0;
        if(amount<0) return -1;
        if(visited[amount]!=-1){
            return visited[amount];
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++)
        {
          int res=dfs(coins,amount-coins[i],visited);
          if(res==0)
          {
              min=Math.min(res+1,min);
          }
        }

        visited[amount]=min!=Integer.MAX_VALUE?min:-1;
        return visited[amount];
    }
}
