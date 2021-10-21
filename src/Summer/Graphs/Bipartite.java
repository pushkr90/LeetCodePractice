package Summer.Graphs;

import java.util.*;

public class Bipartite
{
    HashMap<Integer, List<Integer>> adjList;
    public boolean isBipartite(int[][] color)
    {
        HashSet<Integer> set=new HashSet<>();
        adjList =new HashMap<>();
        for(int i=0;i<color.length; i++)
        {
            for(int j=0;j<color[i].length;j++)
            {
                if(!adjList.containsKey(i))
                {
                    adjList.put(i,new ArrayList<>());
                }
                adjList.get(i).add(color[i][j]);
                if(!adjList.containsKey(color[i][j]))
                {
                    adjList.put(color[i][j],new ArrayList<>());
                }
                adjList.get(color[i][j]).add(i);
            }

        }
        boolean[]visited=new boolean[adjList.size()];
        Queue<Integer> qu=new LinkedList<>();
        qu.offer(0);
        visited[0]=true;
        int[] color1=new int[set.size()];
        color1[0]=-1;
        while(!qu.isEmpty())
        {
            int size=qu.size();
            for(int i=0;i<size;i++)
            {
                int curr=qu.poll();
                int currColor=color1[curr];
                for(int each:adjList.get(curr))
                {
                    if(!visited[each])
                    {
                        color1[each]=-currColor;
                        qu.offer(each);
                    }
                    else if(color1[each]==color1[curr])
                    {
                        return false;
                    }
                }
            }

        }
        return true;
    }
}
