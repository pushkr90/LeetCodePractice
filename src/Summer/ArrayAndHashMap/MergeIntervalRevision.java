package Summer.ArrayAndHashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervalRevision {
    public int[][] merge(int[][] intervals)
    {
        List<int[]> res=new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int []start=intervals[0];
        res.add(start);

        for(int i=0;i<intervals.length;i++)
        {
            int[] nw=intervals[i];
            if(nw[0]<=start[0])
            {
                start[1]=Math.max(nw[1],start[1]);
            }
            else{
                start[0]=nw[0];
                start[1]=nw[1];
                res.add(start);
            }

        }
        return res.toArray(new int[res.size()][]);
    }
}
