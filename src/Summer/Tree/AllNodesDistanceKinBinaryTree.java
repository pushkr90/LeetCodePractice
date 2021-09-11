package Summer.Tree;

import Summer.Others.TreeNode;

import java.util.*;

public class AllNodesDistanceKinBinaryTree {
    List<Integer> res=new ArrayList<>();
    HashMap<TreeNode,List<TreeNode>> map=new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k)
    {

        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(target);
        HashSet<TreeNode> set=new HashSet<>();
        set.add(target);
        buildMap(root,null);
        while (!qu.isEmpty())
        {
            if(k==0)
            {
                while(!qu.isEmpty())
                {
                    res.add(qu.poll().val);

                }
                return res;
            }
            int size=qu.size();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=qu.poll();
                for(TreeNode each:map.get(curr))
                {
                    if(!set.contains(each))
                    {
                        set.add(each);
                        qu.offer(each);
                    }
                }

            }
            k--;
        }
        return res;


    }
    private void buildMap(TreeNode node,TreeNode parent)
    {
        if(node==null) return;
        if(!map.containsKey(node))
        {
            map.put(node,new ArrayList<>());
            if(parent!=null)
            {
                map.get(node).add(parent);
                map.get(parent).add(node);
            }
        }
        buildMap(node.left,node);
        buildMap(node.right,node);
    }
}
