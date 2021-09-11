package Summer.google;

import Summer.Others.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumBST {
    public int maxLevelSum(TreeNode root)
    {
        if(root==null) return 0;
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        int result=0;
        int level=0;
        int tempsum=Integer.MIN_VALUE;
        while(!qu.isEmpty())
        {
            int size= qu.size();
            int sum=0;
            level++;
            for(int i=0;i<size;i++)
            {
                TreeNode curr=qu.poll();
                sum+=curr.val;
                if(curr.left!=null)
                {
                    qu.offer(curr.left);
                }
                if(curr.right!=null)
                {
                    qu.offer(curr.right);
                }
            }
            if(sum>tempsum)
            {
                result=level;
                tempsum=sum;
            }
        }
        return result;

    }
}
