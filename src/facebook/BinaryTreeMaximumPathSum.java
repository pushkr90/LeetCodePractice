package facebook;

import Summer.Others.TreeNode;

public class BinaryTreeMaximumPathSum
{
    int max;
    public int maxPathSum(TreeNode root)
    {

        max=Integer.MIN_VALUE;

        check(root);
        return max;

    }

    private int check(TreeNode root)
    {
        if(root==null) return 0;
        int left=Math.max(check(root.left),0);
        int right=Math.max(check(root.right),0);
        max=Math.max(max,root.val+left+right);
        return Math.max(left,right)+root.val;
    }
}
