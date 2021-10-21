package Summer.vmWare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> res=new ArrayList<>();

       Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
      //  Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[] first=intervals[0];
        res.add(first);

        for(int i=0;i<intervals.length;i++)
        {
            int[]curr=intervals[i];

            if(curr[0]<first[1])
            {
                first[1]=Math.max(first[1],curr[1]);

            }
            else{
                first=curr;
                res.add(first);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
