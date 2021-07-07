package Summer.ArrayAndHashMap;

import java.util.Arrays;

public class MeetingRoomTwoMethodTWO {
    public int minMeetingRooms(int[][] intervals)
    {
        if(intervals.length==0) return 0;


        int[] startTime=new int[intervals.length];
        int[] endTime=new int[intervals.length];

        int rooms=0;
        for(int i=0;i<intervals.length;i++)
        {
            int each[]=intervals[i];
            int start=each[0];
            int end=each[1];
            startTime[i]=start;
            endTime[i]=end;
        }
        Arrays.sort(startTime);
        Arrays.sort(endTime);
        int endTimepointer=0;
        for(int i=0;i<startTime.length;i++)
        {
            if(startTime[i]<endTime[endTimepointer])
            {
                rooms++;
            }else{
                endTimepointer++;
            }
        }
        return rooms;

    }
}
