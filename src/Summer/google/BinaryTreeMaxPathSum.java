package Summer.google;

import Summer.Others.TreeNode;
import sun.reflect.generics.tree.Tree;

public class BinaryTreeMaxPathSum
{
    int max;
    public int maxPathSum(TreeNode root)
    {
        helper(root);
        return max;
    }

    private int helper(TreeNode node)
    {
        if(node==null) return 0;
        int left=Math.max(helper(node.left),0);
        int right=Math.max(helper(node.right),0);
        max=Math.max(max,left+right+ node.val);
        return Math.max(left,right)+node.val;

    }
}
