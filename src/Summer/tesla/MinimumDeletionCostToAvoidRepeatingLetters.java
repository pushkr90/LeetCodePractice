package Summer.tesla;

import javax.swing.plaf.IconUIResource;

public class MinimumDeletionCostToAvoidRepeatingLetters {
    public int minCost(String s, int[] cost)
    {
        int res=0;

        int maxCost=cost[0];

        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                res+=Math.min(maxCost,cost[i]);
                maxCost=Math.max(cost[i], cost[i-1]);
            }
            else{
                maxCost=cost[i];
            }
        }
        return res;
    }
}
