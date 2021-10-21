package Summer.Graphs;

import java.util.*;

public class FindIFpathExistsBFS
{
    HashMap<Integer, List<Integer>> adjList;
    public boolean validPath(int n, int[][] edges, int start, int end)
    {
        adjList=new HashMap<>();

        for(int[] each:edges)
        {
            if(!adjList.containsKey(each[0]))
            {
                adjList.put(each[0],new ArrayList<>());
            }
            adjList.get(each[0]).add(each[1]);

            if(!adjList.containsKey(each[1]))
            {
                adjList.put(each[1],new ArrayList<>());
            }
            adjList.get(each[1]).add(each[0]);
        }

        boolean[]Visited=new boolean[n];

        Queue<Integer> qu=new LinkedList<>();
        qu.offer(start);
        Visited[start]=true;
        while(!qu.isEmpty())
        {
            int size=qu.size();
           // int curr=qu.poll();

                for(int i=0;i<size;i++)
                {
                    int curr=qu.poll();
                    if(adjList.containsKey(curr))
                    {
                   List<Integer> list=adjList.get(curr);
                   for(int each: list)
                   {
                       if(each==end)
                       {
                           return true;
                       }
                       if(!Visited[each])
                       {
                           Visited[each]=true;
                           qu.offer(each);
                       }
                   }
                }
            }
        }
        return false;

    }
}
