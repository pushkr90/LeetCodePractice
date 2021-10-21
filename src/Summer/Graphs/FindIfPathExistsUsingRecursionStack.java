package Summer.Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindIfPathExistsUsingRecursionStack {
    HashMap<Integer, List<Integer>> adjList;
    boolean[]visited;
    public boolean validPath(int n, int[][] edges, int start, int end)
    {
        adjList =new HashMap<>();
        visited=new boolean[n];

        for(int [] each:edges)
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
        visited[start]=true;
        return dfs(edges,start,end);
    }

    private boolean dfs(int[][] edges,int start,int end)
    {
        if(start==end) return true;

        if(adjList.containsKey(start))
        {
            List<Integer> list=adjList.get(start);
            for(int each: list)
            {
                if(!visited[each])
                {
                    visited[each]=true;
                    if(dfs(edges,each,end))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
