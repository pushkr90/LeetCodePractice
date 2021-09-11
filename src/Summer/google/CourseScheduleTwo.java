package Summer.google;

import java.util.*;

public class CourseScheduleTwo {
    public int[] findOrder(int numCourses, int[][] prerequisites)
    {
    List<Integer> res=new ArrayList<>();
        HashMap<Integer,List<Integer>> map=new HashMap<Integer, List<Integer>>();
        for(int[] each:prerequisites)
        {

            if(!map.containsKey(each[1]))
            {
                map.put(each[1],new ArrayList<>());
            }
            map.get(each[1]).add(each[0]);
        }

        int[]indegree=new int[numCourses];

        for(int each:map.keySet())
        {
           for(int each1:map.get(each))
           {
               indegree[each1]++;
           }
        }
        Queue<Integer> qu=new LinkedList<>();

        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            {
                qu.offer(indegree[i]);
                //res.add(indegree[i]);
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
                    indegree[each]--;
                    if(indegree[each]==0)
                    {
                        qu.offer(indegree[each]);
                    }
                }
            }
        }

        int[] resukt=new int[res.size()];
        for(int i=0;i<resukt.length;i++)
        {
            resukt[i]=res.get(i);
        }
        return resukt;
    }
}
