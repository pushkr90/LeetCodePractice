package Summer.Graphs;

import java.util.*;

public class ReconstructItinerary {
    public List<String> findItinerary(List<List<String>> tickets)
    {
        HashMap<String, PriorityQueue<String>> adjList=new HashMap<>();
        List<String> res=new ArrayList<>();
        for(List<String> each:tickets)
        {
            if(!adjList.containsKey(each.get(0)))
            {
                adjList.put(each.get(0),new PriorityQueue<>());
            }
            adjList.get(each.get(0)).add(each.get(1));
        }

        dfs("JFK",adjList,tickets,res);
        return res;
    }

    private void dfs(String vertex,HashMap<String,PriorityQueue<String>> adjList,List<List<String>> tickets,List<String> res)
    {
        PriorityQueue<String> pq=adjList.get(vertex);
        while(pq!=null && !pq.isEmpty())
        {
            String curr=pq.poll();
            dfs(curr,adjList,tickets,res);
        }
        res.add(0,vertex);
    }
}
