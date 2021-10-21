package Summer.Graphs;

import java.util.*;

public class ReconstructItenary {

    Map<String, PriorityQueue<String>> adjList;
    public List<String> findItinerary(List<List<String>> tickets)
    {
        LinkedList<String> res = new LinkedList<>();
        adjList=new HashMap<>();
        for (List<String> each:tickets)
        {
            if(!adjList.containsKey(each.get(0)))
            {
                adjList.put(each.get(0),new PriorityQueue<>());
            }
            adjList.get(each.get(0)).add(each.get(1));
        }
        dfs("JFK",res);
        return res;
    }

    private void dfs(String vertex,LinkedList<String>res)
    {
       PriorityQueue<String>pq=adjList.get(vertex);
       while(pq!=null && !pq.isEmpty())
       {
           dfs(pq.poll(),res);
       }
       res.addFirst(vertex);
    }
}
