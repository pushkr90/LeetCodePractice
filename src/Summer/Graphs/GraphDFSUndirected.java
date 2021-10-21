package Summer.Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class GraphDFSUndirected
{
    boolean [] visited;
    public List<Integer> undirectedTraversal(int[][] arr)
    {
        List<Integer> res=new ArrayList<>();
        HashMap<Integer,List<Integer>> adjList=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();

        for(int[] each:arr)
        {
            set.add(each[0]);
            if(!adjList.containsKey(each[0]))
            {
                adjList.put(each[0],new ArrayList<>());
            }
            adjList.get(each[0]).add(each[1]);
            set.add(each[1]);
            if(!adjList.containsKey(each[1]))
            {
                adjList.put(each[1],new ArrayList<>());
            }
            adjList.get(each[1]).add(each[1]);
        }
        visited=new boolean[set.size()+1];
        for(int each:adjList.keySet())
        {
            if(!visited[each])
            {
                dfs(each,adjList,res);
            }

        }
        return res;

    }
    private void dfs(int vertex,HashMap<Integer,List<Integer>>adjList,List<Integer>res)
    {
        res.add(vertex);
        visited[vertex]=true;
        if(adjList.containsKey(vertex))
        {
            for(int each:adjList.get(vertex))
            {
                if(!visited[each])
                {
                    dfs(each,adjList,res);
                }
            }
        }

    }

}
