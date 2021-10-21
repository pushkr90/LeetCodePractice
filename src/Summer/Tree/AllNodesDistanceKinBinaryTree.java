package Summer.Tree;

import Summer.Others.TreeNode;

import java.util.*;

public class AllNodesDistanceKinBinaryTree {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k)
    {
        List<Integer> res=new ArrayList<>();

        HashMap<TreeNode,List<TreeNode>> adjList=new HashMap<>();

        buildMatrix(adjList,root,null);
        HashSet<TreeNode> visited=new HashSet<>();

        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(target);
        while(!qu.isEmpty() && k>0)
        {
            k--;
            int size= qu.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=qu.poll();
                visited.add(curr);
                List<TreeNode> list=adjList.get(curr);
                for(TreeNode each:list)
                {
                    if(!visited.contains(each))
                    {
                        qu.offer(each);
                    }
                }
            }
        }

        while(!qu.isEmpty())
        {
            res.add(qu.poll().val);
        }
        return res;
    }

    private void buildMatrix(HashMap<TreeNode,List<TreeNode>> adjList,TreeNode root,TreeNode parent)
    {
        if(root==null) return;

        if(parent!=null)
        {
            if(!adjList.containsKey(root))
            {
                adjList.put(root,new ArrayList<>());
            }
            adjList.get(root).add(parent);
            if(!adjList.containsKey(parent))
            {
                adjList.put(parent,new ArrayList<>());
            }
            adjList.get(parent).add(root);
        }
        else{
            if(!adjList.containsKey(root))
            {
                adjList.put(root,new ArrayList<>());
            }
            //adjList.get(root).add(parent);
        }
        buildMatrix(adjList,root.right,root);
        buildMatrix(adjList,root.left,root);

    }
}
