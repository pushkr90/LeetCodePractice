package Summer.vmWare;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int each:nums)
        {
            map.put(each,map.getOrDefault(each,0)+1);
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        int[] res=new int[k];
        while(k!=0)
        {
            res[k--]=pq.poll();
        }
        return res;

    }
}
