package Summer.Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GraphDFSCycleDetection
{
    HashMap<Integer, List<Integer>> adjList;
    HashMap<Integer, Boolean > visited;

    public boolean cycleDFS(int[][] arr)
    {

        adjList=new HashMap<>();
        visited=new HashMap<>();

        for(int[] each:arr)
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

        for(int each:adjList.keySet())
        {
            if(!visited.containsKey(each))
            {
                visited.put(each,true);
                for(int each1:adjList.get(each))
                {
                    if(dfs(each1,-1))
                    {
                        return true;
                    }
                }
            }
        }
        return false;

    }

    private boolean dfs(int vertex, int parent)
    {
        visited.put(vertex,true);
        if(adjList.containsKey(vertex))
        {
            for (int each : adjList.get(vertex))
            {
                if (!visited.containsKey(each))
                {
                    if (dfs(each, vertex))
                    {
                        return true;
                    }

                } else if (each != parent && parent!=-1)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
