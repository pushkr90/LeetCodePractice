package Summer.Graphs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class GraphDFSDirected {
    boolean[]visited;
    List<Integer> res;
    public List<Integer> directedGraph(int[][] arr)
    {
        res=new ArrayList<>();
        HashMap<Integer,List<Integer>> adjList=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();

        for(int[] each:arr)
        {
            set.add(each[0]);
            set.add(each[1]);
            if(!adjList.containsKey(each[0]))
            {
                adjList.put(each[0],new ArrayList<>());
            }
            adjList.get(each[0]).add(each[1]);
        }
        visited=new boolean[set.size()+1];// +1 because the graph starts with 1 hence visited[0] will be blank;
        for(int each: adjList.keySet())
        {
               if(!visited[each])
               {
                  dfs(each, adjList, visited);

               }
        }
        return res;
    }

    private void dfs(int vertex,HashMap<Integer,List<Integer>> adjList,boolean[]visited)
    {
        res.add(vertex);
        visited[vertex]=true;
        if(adjList.containsKey(vertex))
        {
            for(int each:adjList.get(vertex))
            {
                if(!visited[each])
                {
                    dfs(each,adjList,visited);
                }
            }
        }
    }
}
