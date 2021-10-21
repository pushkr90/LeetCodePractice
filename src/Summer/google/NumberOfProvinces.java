package Summer.google;

import java.util.HashSet;

public class NumberOfProvinces {
    public int findCircleNum(int[][] M)
    {

        int res=0;
        HashSet<Integer>visited=new HashSet<>();

        for(int i=0;i<M.length;i++)
        {
            if(visited.contains(i))
            {
                continue;
            }
            dfs(i,M,visited);
            res++;
        }
        return res;
    }
    private void dfs(int city,int[][]M,HashSet<Integer> visited)
    {
        if(visited.contains(city))
        {
            return;
        }
        visited.add(city);
        for(int i=0;i<M.length;i++)
        {
            if(M[city][i]==0)
            {
                continue;
            }
            dfs(i,M,visited);
        }
    }
}
