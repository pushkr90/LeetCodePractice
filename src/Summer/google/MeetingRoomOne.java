package Summer.google;

import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoomOne {
    public boolean canAttendMeetings(int[][] intervals)
    {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int[] sample=intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            int[]curr=intervals[i];
            if(sample[1]>curr[0])
            {
                return false;
            }
            sample=curr;
        }
return true;

    }
}
/*
*  [[0,30],[5,10],[15,20]]
* */
