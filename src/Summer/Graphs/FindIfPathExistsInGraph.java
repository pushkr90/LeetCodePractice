package Summer.Graphs;

import java.util.*;

public class FindIfPathExistsInGraph
{
    HashMap<Integer, List<Integer>>adjList;
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
        if(start==end) return true;
        Stack<Integer> stack=new Stack<>();
        stack.push(start);


        while(!stack.isEmpty())
        {
            int curr=stack.pop();
            visited[curr]=true;
            List<Integer> curr1=adjList.get(curr);
            for(int each:curr1)
            {
                if(each==end)
                {
                    return true;
                }
                if(!visited[each])
                {
                    visited[each]=true;
                    stack.push(each);
                }
            }

        }
        return false;


    }
}
