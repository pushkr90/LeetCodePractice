package Summer.google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        List<int[]> merged=new ArrayList<>();
        int[] start=intervals[0];
        int start1=start[0];
        int end1=start[1];
        merged.add(start);
        for(int[]each:intervals)
        {
            int start2=each[0];
            int end2=each[1];
            if((start2<=start[1]))
            {
                start[1]=Math.max(start[1],end2);
                start1=Math.min(start1,start2);
            }
            else{
                start=each;
                merged.add(start);
            }

        }

        return merged.toArray(new int[merged.size()][]);
    }
}
