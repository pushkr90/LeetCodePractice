package Summer.ArrayAndHashMap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementInArrayMAXHEAP
{
    public int findKthLargest(int[] nums, int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                return o2-o1;
            }
        });
        for(int each:nums)
        {
            pq.add(each);

        }
        int res=0;
        while(k-- >0)
        {
            res=pq.poll();

        }

        return res;
    }
}
