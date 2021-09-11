package Summer.Tree;

import Summer.Others.TreeNode;

public class DiameterOfBinaryTree {
    private int max=0;
    public int diameterOfBinaryTree(TreeNode root)
    {
        if(root==null) return 0;
        helper(root);
        return max;
    }

    private int helper(TreeNode node)
    {
        if(node==null) return 0;
        int left=helper(node.left);
        int right=helper(node.right);
        max=Math.max(max,Math.max(left,right));
        return Math.max(left,right)+1;
    }
}
