package Summer.ArrayAndHashMap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRoomtworevision {
    public int minMeetingRooms(int[][] intervals)
    {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        PriorityQueue<int[]> pq=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        pq.offer(intervals[0]);

        for(int i=1;i<intervals.length;i++)
        {
            int [] polled=pq.poll();
            int[] each=intervals[i];
            if(polled[1]> each[0])
            {
                pq.offer(each);
            }
            else{
                polled[1]=Math.max(each[1],polled[1]);
                pq.offer(polled);
            }
         }
        return pq.size();


    }
}
