package Summer.GOOGLELEETCODEEXPLORER;

import Summer.Others.TreeNode;

public class BinaryTreeMaxPathSum
{
    class pair{

    }
    int max=0;

    public int maxPathSum(TreeNode root)
    {
        if(root==null) return 0;
        helper(root);
        return max;
    }

    private int helper(TreeNode node)
    {
        if(node ==null) return 0;
        int left=Math.max(helper(node.left),0);
        int right=Math.max(helper(node.right),0);
        max=Math.max(max,node.val+left+right);
        return (Math.max(left,right)+node.val);
    }
}
