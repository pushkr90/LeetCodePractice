package Summer.google;

import java.util.LinkedList;
import java.util.Queue;

public class CoinChangeBFS {
    public int coinChange(int[] coins, int amount)
    {
        Queue<Integer> qu=new LinkedList<>();
        boolean []visited=new boolean[amount+1];
        qu.offer(amount);
        int level=0;
        while(!qu.isEmpty())
        {
            int size = qu.size();
            level++;
            for (int i=0;i<size;i++)
            {
                int curr=qu.poll();
                for(int j=0;j<coins.length;j++)
                {
                     amount=curr-coins[j];
                     if(amount==0)
                     {
                         return level;
                     }
                     if(!visited[amount] && amount>0)
                     {
                         qu.offer(amount);
                         visited[amount]=true;
                     }

                }

            }
        }
        return -1;
    }
}
