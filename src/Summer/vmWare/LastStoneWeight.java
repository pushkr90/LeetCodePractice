package Summer.vmWare;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i:stones)
        {
            pq.add(i);
        }
        while(pq.size()>1)
        {
            int high= pq.poll();
            int second= pq.poll();
            if(high-second>0)
            {
                pq.offer(high-second);
            }
        }
        return pq.poll();


    }
}
