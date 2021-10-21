package Summer.Tree;

import Summer.Others.TreeNode;

public class longestUnivaluePath {
    int max;
    public int longestUnivaluePath(TreeNode root)
    {
        max=0;
        TreeNode parent=new TreeNode(-1000);
        traverse(root,null);
        return max;
    }
    private int traverse(TreeNode node,TreeNode parent)
    {
        if(node==null) return 0;

        int left=traverse(node.left,node);
        int right=traverse(node.right,node);
        max=Math.max(max,left+right);
        if(node.val==parent.val)
        {
            return 1+Math.max(left,right);
        }

        return 0;
    }
}
