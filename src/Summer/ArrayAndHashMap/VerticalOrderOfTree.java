package Summer.ArrayAndHashMap;

import Summer.Others.TreeNode;

import java.util.*;

public class VerticalOrderOfTree
{
    class pair{
        int x;
        int y;
        TreeNode node;
        public pair(int x,int y, TreeNode node)
        {
            this.x=x;
            this.y=y;
            this.node=node;
        }
    }

    public List<List<Integer>> verticalTraversal(TreeNode root)
    {
        List<List<Integer>> res=new ArrayList<>();
        Map<Integer,List<Integer>> map=new HashMap<>();
        Queue<pair> qu=new LinkedList<>();
        pair nwpair=new pair(0,0,root);
        qu.offer(nwpair);
        int minX=0;
        int maxX=0;
        while(!qu.isEmpty())
        {
            pair p=qu.poll();
            int x=p.x;
            int y=p.y;
            minX=Math.min(x,minX);
            maxX=Math.max(x,maxX);
            int nodeVal=p.node.val;
            if(!map.containsKey(x))
            {
                map.put(x,new ArrayList<>());
            }
            List<Integer> ls=map.get(x);
            ls.add(nodeVal);
            map.put(x,ls);

            if(p.node.left!=null)
            {
                pair p1=new pair(x-1,y+1,p.node.left);
                qu.offer(p1);
            }
            if(p.node.right!=null)
            {
                pair p1=new pair(x+1,y-1,p.node.right);
                qu.offer(p1);
            }
        }
        for(int i=minX;i<maxX;i++)
        {
            res.add(map.get(i));
        }
        return res;
    }
}
