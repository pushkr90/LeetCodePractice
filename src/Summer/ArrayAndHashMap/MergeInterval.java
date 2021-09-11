package Summer.ArrayAndHashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeInterval {
    public int[][] merge(int[][] intervals)
    {
        List<int[]> ans=new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int[] start=intervals[0];
        ans.add(start);

        for(int i=0;i<intervals.length;i++)
        {
            int[] inside=intervals[i];
            if(start[1]>=inside[0])
            {
                start[1]=Math.max(start[1],inside[1]);
                start[0]=Math.min(start[0],inside[0]);
            }else
                {
                    start=inside;
                    ans.add(start);
            }

        }

        return ans.toArray(new int[ans.size()][]);


    }
}
