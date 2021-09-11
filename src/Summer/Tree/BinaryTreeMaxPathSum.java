package Summer.Tree;

import Summer.Others.TreeNode;

public class BinaryTreeMaxPathSum
{
    int res=0;
    public int maxPathSum(TreeNode root)
    {
        helper(root);
        return res;
    }

    public int helper(TreeNode node)
    {

        if(node==null) return 0;

        int left=Math.max(0,helper(node.left));
        int right=Math.max(0,helper(node.right));
        res=Math.max(res,left+right+node.val);
        return Math.max(left,right)+node.val;
    }
}
