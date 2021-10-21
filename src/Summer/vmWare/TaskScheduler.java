package Summer.vmWare;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char each:tasks)
        {
            map.put(each,map.getOrDefault(each,0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->(map.get(b)-map.get(a)));
        pq.addAll(map.keySet());

        int res=0;
        while(!pq.isEmpty())
        {
            int interval=n+1;
            HashSet<Character> set=new HashSet<>();
            while(!pq.isEmpty() && interval!=0)
            {
                char each=pq.poll();
                interval--;
                set.add(each);
                map.put(each,map.get(each)-1);
                res++;
            }
            for(char each:set)
            {
                if(map.get(each)>0)
                {
                    pq.add(each);
                }
            }

            if(pq.isEmpty()) break;
            res+=interval;

        }
        return res;
    }
}
