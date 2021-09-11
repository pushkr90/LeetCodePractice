package Summer.Tree;

import java.util.*;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites)
    {
        /*
        [0,1][1,2],[1,3]
        * */
        HashMap<Integer, List<Integer>> map=new HashMap<>();
        for(int[] each:prerequisites)
        {
            if(!map.containsKey(each[0]))
            {
                map.put(each[0],new ArrayList<>());
            }
            map.get(each[0]).add(each[1]);
        }

        Queue<Integer> qu=new LinkedList<>();

        int[] indegree=new int[numCourses];
        for(int each:map.keySet())
        {
            for(int each1:map.get(each))
            {
                indegree[each1]++;
            }
        }

        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            {
                qu.offer(i);
            }
        }
        int res=0;

        while(!qu.isEmpty())
        {
            int curr=qu.poll();
            res++;
            if(map.containsKey(curr))
            {
                for(int each:map.get(curr))
                {
                    if(indegree[each]--==0)
                    {
                        qu.offer(each);
                    }
                }
            }
        }
        return res==numCourses?true:false;

    }
}
