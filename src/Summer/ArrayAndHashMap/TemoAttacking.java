package Summer.ArrayAndHashMap;

import java.util.HashSet;

public class TemoAttacking {
    public int findPoisonedDuration(int[] timeSeries, int duration)
    {

        if(timeSeries.length==0) return 0;
        int total=0;
        for (int i=1;i<timeSeries.length;i++)
        {
            total+=Math.min(timeSeries[i]-timeSeries[i-1],2);


        }
        return  total;

    }
}
