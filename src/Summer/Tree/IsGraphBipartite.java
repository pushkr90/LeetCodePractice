package Summer.Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class IsGraphBipartite {
    public boolean isBipartite(int[][] graph)
    {
        int[] res=new int[graph.length];
        Arrays.fill(res,0);
        Queue<Integer> qu=new LinkedList<>();


        for(int i=0;i<graph.length;i++)
        {
            if(res[i]==0)
            {
                res[i]=1;
               qu.offer(i);

           while(!qu.isEmpty())
           {
               int curr=qu.poll();
               for(int each:graph[curr])
               {
                   if(res[each]==0)
                   {
                       res[each]=-res[curr];
                       qu.offer(each);
                   }
                   if(res[each]==res[curr])
                   {
                       return false;
                   }

               }
           }
            }
        }
        return true;

    }
}
