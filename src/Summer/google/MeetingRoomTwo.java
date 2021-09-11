package Summer.google;

import java.util.Arrays;

public class MeetingRoomTwo {
    public int minMeetingRooms(int[][] intervals)
    {
        int[] startTime=new int[intervals.length];
        int[] endTime=new int[intervals.length];

        for(int i=0;i< intervals.length;i++)
        {
            int[] curr=intervals[i];
            startTime[i]=curr[0];
            endTime[i]=curr[1];
        }

        Arrays.sort(startTime);
        Arrays.sort(endTime);

        int endPointer=0;
        int count=0;
        for(int i=0;i<startTime.length;i++)
        {
            if(startTime[i]<endTime[endPointer])
            {
                count++;
            }else{
                endPointer++;
            }
        }
        return count;
    }
}
