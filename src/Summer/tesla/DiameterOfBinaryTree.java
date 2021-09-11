package Summer.tesla;

import Summer.Others.TreeNode;

public class DiameterOfBinaryTree {
    private int diamter=0;
    public int diameterOfBinaryTree(TreeNode root)
    {
        if(root==null) return 0;
        helper(root);
        return diamter;
    }

    private int helper(TreeNode node)
    {
        if(node==null) return 0;
        int left=helper(node.left);
        int right=helper(node.right);
        diamter=Math.max(diamter,left+right);
        return Math.max(left,right)+1;
    }
}
