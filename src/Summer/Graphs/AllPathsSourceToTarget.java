package Summer.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AllPathsSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res1=new ArrayList<>();

        Queue<List<Integer>> qu=new LinkedList<>();
        List<Integer> temp=new ArrayList<>();
        temp.add(0);
        qu.offer(temp);
        int target=graph.length-1;
        while(!qu.isEmpty())
        {
            List<Integer> res=qu.poll();
            int lastInRes=res.get(res.size()-1);
            if(lastInRes==target)
            {
                res1.add(new ArrayList<>(res));

            }
            else{
                int[] neighbours=graph[lastInRes];
                for(int each:neighbours)
                {
                    List<Integer> l=new ArrayList<>(res);
                    l.add(each);
                    qu.offer(l);
                }

            }
        }
        return res1;


    }
}
