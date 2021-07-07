package Summer.ArrayAndHashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {
    public int[][] merge(int[][] intervals)
    {
        List<int[]> res=new ArrayList<>();

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int[]startio=intervals[0];
        int start=startio[0];
        int end=startio[1];
        res.add(startio);

        for(int i=0;i<intervals.length;i++)
        {
            int[] nw=intervals[i];
            int nwstart=nw[0];
            int newend=nw[1];

            if(nwstart<=startio[1] )
            {
                startio[1]=Math.max(startio[1],newend);
            }
            else
                {
                startio=intervals[i];
                res.add(startio);
            }

        }

        return res.toArray(new int[res.size()][]);

    }
}
