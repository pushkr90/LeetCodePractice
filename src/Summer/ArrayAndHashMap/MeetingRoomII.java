package Summer.ArrayAndHashMap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoomII {
    public int minMeetingRooms(int[][] intervals)
    {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        PriorityQueue<int[]> pq=new PriorityQueue<>(intervals.length, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        pq.offer(intervals[0]);
        for(int i=1;i<intervals.length;i++)
        {
            int[] inter=pq.poll();

            if(inter[1]<=intervals[i][0])
            {
                inter[1]=intervals[i][1];
            }
            else{
                pq.offer(intervals[i]);
            }
            pq.offer(inter);

        }
        return pq.size();

    }




}
