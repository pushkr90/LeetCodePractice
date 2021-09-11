package Summer.ArrayAndHashMap;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom {
    public boolean canAttendMeetings(int[][] intervals)
    {if(intervals.length==0) return true;

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        int[] start=intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            int[] inside=intervals[i];
            if(start[1]>inside[0])
            {
                return false;
            }
            start=inside;
        }
        return true;

    }
}
