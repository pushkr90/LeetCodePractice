package Summer.Graphs;

import java.util.*;

public class GraphBFSDirected
{

    public List<Integer> BFSDirected(int[][] arr)
    {
        List<Integer> res=new ArrayList<>();
        Queue<Integer> qu=new LinkedList<>();
        HashSet<Integer> set=new HashSet<>();

        HashMap<Integer,List<Integer>> adjList=new HashMap<>();
        for(int[]each:arr)
        {
            set.add(each[0]);
            set.add(each[1]);
            if(!adjList.containsKey(each[0]))
            {
                adjList.put(each[0],new ArrayList<>());
            }
            adjList.get(each[0]).add(each[1]);
        }

        boolean[]visited=new boolean[set.size()+1];
        for(int each:adjList.keySet())
        {
            if(!visited[each])
            {
                qu.offer(each);
            }


            while(!qu.isEmpty())
            {
                int size=qu.size();
                for(int i=0;i<size;i++)
                {
                    int curr=qu.poll();
                    visited[curr]=true;
                    res.add(curr);
                    if(adjList.containsKey(curr)) {
                        List<Integer> list = adjList.get(curr);
                        for (int each1 : list) {
                            if(!visited[each1]) {
                                qu.offer(each1);
                            }
                        }
                    }
                }
            }
        }

        return res;




    }
}
