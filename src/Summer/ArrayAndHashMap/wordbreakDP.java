package Summer.ArrayAndHashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class wordbreakDP
{
    public boolean wordBreak(String s, List<String> wordDict)
    {
        HashSet<String> set=new HashSet<>(wordDict);
        Boolean[]dp=new Boolean[s.length()+1];
        dp[0]=true;
        for(int len=1;len< dp.length;len++)
        {
            for(int i=0;i<len;i++)
            {
                if(dp[i]==true && set.contains(s.substring(i,len)))
                {
                    dp[len]=true;
                    break;
                }
            }
        }

        return dp[dp.length-1];
    }
}
