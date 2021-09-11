package Summer.Tree;

import Summer.Others.TreeNode;
import apple.laf.JRSUIUtils;

import java.util.*;

public class VerticalOrderTraversalofaBinaryTree
{
    class pair{
        int x;
        int y;
        TreeNode node;
        public pair(int x, int y, TreeNode node)
        {
            this.x=x;
            this.y=y;
            this.node=node;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root)
    {
        List<List<Integer>> res=new ArrayList<>();
        TreeMap<Integer,List<pair>> map=new TreeMap<>();
        Queue<pair> qu=new LinkedList<>();
        qu.offer(new pair(0,0,root));
        int minX=Integer.MAX_VALUE;
        int maxX=Integer.MIN_VALUE;

        while(!qu.isEmpty())
        {
            int size=qu.size();
            for(int i=0;i<size;i++)
            {
                pair curr=qu.poll();
                minX=Math.min(maxX,curr.x);
                maxX=Math.max(maxX,curr.x);
                if(curr.node.left!=null)
                {
                    qu.offer(new pair(curr.x+1,curr.y-1,curr.node.left));
                }
                if(curr.node.right!=null)
                {
                    qu.offer(new pair(curr.x+1,curr.y+1,curr.node.right));
                }
                if(!map.containsKey(curr.x))
                {
                    map.put(curr.x,new ArrayList<>());
                }
                map.get(curr.x).add(curr);
            }
        }

        for(int i=minX;i<=maxX;i++)
        {
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<map.get(i).size();j++)
            {
                temp.add(map.get(i).get(j).node.val);

            }
            res.add(temp);
        }
        return res;

    }
}
