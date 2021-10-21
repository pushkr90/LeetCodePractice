package Summer.Graphs;

import java.util.*;

public class AllPathsSourceToTargetBFS
{
    public List<List<Integer>> allPathsSourceTarget(int[][] graph)
    {
        List<List<Integer>> res=new ArrayList<>();
        HashMap<Integer,List<Integer>> adjList=new HashMap<>();
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
        Queue<List<Integer>> qu=new LinkedList<>();
        List<Integer> temp=new ArrayList<>();
        temp.add(0);
        qu.offer(temp);
        while(!qu.isEmpty())
        {
            List<Integer> list=qu.poll();
            for(int each:adjList.get(list.get(list.size()-1)))
            {
                List<Integer> temp1=new ArrayList<>(list);
                temp1.add(each);
                if(temp1.get(temp1.size()-1)==graph.length-1)
                {
                    res.add(temp1);
                }
                qu.offer(temp1);
            }

        }
        return res;

    }
}
