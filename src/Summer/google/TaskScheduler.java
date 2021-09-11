package Summer.google;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {

        HashMap<Character,Integer> map=new HashMap<>();
        for(char each:tasks)
        {
            map.put(each,map.getOrDefault(each,0)+1);
        }

        PriorityQueue<Character> pq=new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return map.get(o2)-map.get(o1);
            }
        });

        pq.addAll(map.keySet());
        int res=0;
        while(!pq.isEmpty())
        {
            HashSet<Character> set=new HashSet<>();
            int val=n+1;
            while(!pq.isEmpty() && val!=0)
            {
                char curr=pq.remove();
                set.add(curr);
                map.put(curr,map.get(curr)-1);
                val--;
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
            res+=val;
        }

        return res;
    }
}
