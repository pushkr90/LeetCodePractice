package Summer.Tree;

import java.util.*;

public class CourseScheduleTWO {
    public int[] findOrder(int numCourses, int[][] prerequisites)
    {
        List<Integer> res=new ArrayList<>();

        HashMap<Integer, List<Integer>> map=new HashMap<>();

        for(int[] each:prerequisites)
        {
            if(!map.containsKey(each[0]))
            {
                map.put(each[0],new ArrayList<>());
            }

            map.get(each[0]).add(each[1]);
        }

        int[] count=new int[numCourses];

        for(int each:map.keySet())
        {
            for(int each1:map.get(each))
            {
                count[each1]++;
            }
        }
        Queue<Integer> qu=new LinkedList<>();
        for(int i=0;i<count.length;i++)
        {
            if(count[i]==0)
            {
                qu.offer(i);
            }
        }

        while(!qu.isEmpty())
        {
            int curr=qu.poll();
            res.add(curr);

            if(map.containsKey(curr))
            {
                for(int each:map.get(curr))
                {
                    if(--count[each]==0)
                    {
                        qu.offer(each);
                        res.add(each);
                    }
                }
            }
        }
        int [] fina=new int[numCourses];
        if(res.size()==numCourses)
        {
            for(int i=0;i<res.size();i++)
            {
                fina[i]=res.get(i);
            }

        }
        return fina;

    }
}
