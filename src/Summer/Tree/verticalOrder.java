package Summer.Tree;

import Summer.Others.TreeNode;

import java.util.*;

public class verticalOrder {

    class pair{
        TreeNode node;
        int x;
        int y;
        public pair(TreeNode node,int x,int y)
        {
            this.node= node;
            this.x=x;
            this.y=y;
        }
    }
    TreeMap<Integer,List<pair>> map;
    public List<List<Integer>> verticalTraversal(TreeNode root)
    {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null) return res;
        map=new TreeMap<>();
        int minX=0;
        int maxX=0;
        Queue<pair>qu=new LinkedList<>();
        pair p=new pair(root,0,0);
        qu.offer(p);
        while(!qu.isEmpty())
        {
            pair curr=qu.poll();
            minX=Math.min(minX,curr.x);
            maxX=Math.max(maxX,curr.x);
            if(!map.containsKey(curr.x))
            {
                map.put(curr.x,new ArrayList<>());
            }
            map.get(curr.x).add(curr);
            if(curr.node.left!=null)
            {
                pair p1=new pair(curr.node.left,curr.x-1,curr.y+1);
                qu.offer(p1);

            }
            if(curr.node.right!=null)
            {
                pair p1=new pair(curr.node.right,curr.x+1,curr.y+1);
                qu.offer(p1);
            }
        }

        for(Map.Entry<Integer,List<pair>> each:map.entrySet())
        {
            List<pair> temp=new ArrayList<>();
           temp= each.getValue();
           Collections.sort(temp,(a,b)->a.y==b.y?a.node.val-b.node.val:0);
           List<Integer> intList=new ArrayList<>();
           for(pair each1:temp)
           {
               intList.add(each1.node.val);
           }
           res.add(intList);
        }
        return res;

    }
}
