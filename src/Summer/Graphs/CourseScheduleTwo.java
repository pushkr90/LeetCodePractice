package Summer.Graphs;

import java.util.*;

public class CourseScheduleTwo
{
    HashMap<Integer, List<Integer>>adjList;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        adjList=new HashMap<>();
        List<Integer> res=new ArrayList<>();

        for(int[] each:prerequisites)
        {
            if(!adjList.containsKey(each[1]))
            {
                adjList.put(each[1],new ArrayList<>());
            }
            adjList.get(each[1]).add(each[0]);
        }

        int[] indegree=new int[numCourses];


        for(List<Integer> each: adjList.values())
        {
            for(int i:each)
            {
                indegree[i]++;
            }
        }

        Queue<Integer> qu=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            {
                qu.offer(i);
            }
        }

        while(!qu.isEmpty())
        {
            int curr=qu.poll();
            res.add(curr);
            if(adjList.containsKey(curr))
            {
                for(int each:adjList.get(curr))
                {
                    indegree[each]--;
                    if(indegree[each]==0)
                    {
                        qu.offer(each);
                    }
                }
            }
        }

        if(res.size()==numCourses)
        {
            int[] res1=new int[numCourses];
            for(int i=0;i<res.size();i++)
            {
                res1[i]=res.get(i);
            }
            return res1;
        }

        return new int[]{};


    }
}
