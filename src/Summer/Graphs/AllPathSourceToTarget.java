package Summer.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AllPathSourceToTarget
{
    HashMap<Integer,List<Integer>> adjList;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph)
    {
        List<List<Integer>> res=new ArrayList<>();

       // boolean[] visited=new boolean[graph.length];
        adjList=new HashMap<>();
        for(int i=0;i<graph.length;i++)
        {
            if(!adjList.containsKey(i))
            {
                adjList.put(i,new ArrayList<>());
            }

            for(int j=0;j<graph[i].length;j++)
            {
                adjList.get(i).add(graph[i][j]);
            }
        }

       List<Integer> temp=new ArrayList<>();
        temp.add(0);
        dfs(0,graph,temp,res);
        return res;

    }

    private void dfs(int start,int[][] graph,List<Integer> temp,List<List<Integer>> res)
    {
        if(start==graph.length-1)
        {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int each:adjList.get(start))
        {
            temp.add(each);
            dfs(each, graph, temp, res);
            temp.remove(temp.size()-1);
        }

    }
}
