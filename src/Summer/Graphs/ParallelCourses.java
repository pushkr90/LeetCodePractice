package Summer.Graphs;

import java.util.*;

public class ParallelCourses {
    public int minimumSemesters(int n, int[][] relations) {
        HashMap<Integer,List<Integer>> adjList=new HashMap<Integer, List<Integer>>();

        Queue<Integer> qu=new LinkedList<>();

        for(int[] each:relations)
        {
            if(!adjList.containsKey(each[0]))
            {
                adjList.put(each[0],new ArrayList<>());
            }
            adjList.get(each[0]).add(each[1]);
        }


        int[]indegree=new int[n+1];

        for(List<Integer> each:adjList.values())
        {
            for(int i=0;i<each.size();i++)
            {
                indegree[each.get(i)]++;
            }
        }

        for(int i=1;i<n+1;i++)
        {
            if(indegree[i]==0)
            {
                qu.offer(i);
            }

        }

        int level=0;
        int count=n;
        while(!qu.isEmpty())
        {
            int size=qu.size();
            level++;
            for(int i=0;i<size;i++)
            {
                int curr=qu.poll();
                count--;
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
        }
        return count==0?level:-1;

    }
}
