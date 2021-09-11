package Summer.ArrayAndHashMap;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval)
    {
        List<int[]> res=new ArrayList<>();

        for(int [] each:intervals)
        {

            if(each[1]<newInterval[0])
            {
                res.add(each);
            }
            else if(each[0]>newInterval[1])
            {
                res.add(newInterval);
                newInterval=each;
            }
            else{
                newInterval[0]=Math.min(newInterval[0],each[0]);
                newInterval[1]=Math.max(newInterval[1],each[1]);
            }


        }
        res.add(newInterval);
        return res.toArray(new int[res.size()][]);

    }
}
