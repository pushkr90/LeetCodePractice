package Summer.vmWare;

import Summer.Others.TreeNode;

import java.util.*;

public class AllNodesKdistance {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        List<Integer> res=new ArrayList<>();
        HashMap<TreeNode,List<TreeNode>>adjList=new HashMap<>();
        buildMap(adjList,root,null);
        HashSet<TreeNode> visited=new HashSet<>();
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(target);
        visited.add(target);

        while(!qu.isEmpty())
        {
            if(k==0)
            {
                while (!qu.isEmpty())
                {
                    res.add(qu.poll().val);
                }
                return res;
            }
            int size= qu.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=qu.poll();

                for(TreeNode each:adjList.get(curr))
                {
                    if(!visited.contains(each))
                    {
                        visited.add(each);
                        qu.offer(each);
                    }
                }
                k--;
            }
        }
        return res;


    }

    private void buildMap(HashMap<TreeNode,List<TreeNode>> adjList,TreeNode root,TreeNode parent)
    {
        if(root==null)
        {
            return;
        }
        if(!adjList.containsKey(root))
        {
            adjList.put(root,new ArrayList<>());
            if(parent!=null)
            {
                adjList.get(root).add(parent);
                adjList.get(parent).add(root);
            }
        }
        buildMap(adjList,root.left,root);
        buildMap(adjList,root.right,root);
    }
}
