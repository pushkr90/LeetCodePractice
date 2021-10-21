package Summer.Graphs;

import java.util.ArrayList;
import java.util.List;

public class AllPathsSourceToTargetDFS {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> path=new ArrayList<>();
        path.add(0);

        int target=graph.length-1;

        dfs(0,target,res,path,graph);
        return res;

    }

    private void dfs(int vertex,int target,List<List<Integer>>res,List<Integer> path,int[][] graph)
    {
        if(vertex==target)
        {
            res.add(new ArrayList<>(path));
            return;

        }
       for(int each:graph[vertex])
       {
           path.add(each);
           dfs(each,target,res,path,graph);
           path.remove(path.size()-1);
       }
    }
}
