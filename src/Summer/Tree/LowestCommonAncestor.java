package Summer.Tree;

import Summer.Others.TreeNode;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
    {
        if(root==p ||root==q) return root;
        return traverse(root,p,q);

    }

    private TreeNode traverse(TreeNode root,TreeNode p,TreeNode q)
    {
        if(root==null) return null;
        if(root==p||root==q) return root;
        TreeNode left=traverse(root.left,p,q);
        TreeNode right=traverse(root.right,p,q);

        if(left==null&& right==null)
        {
            return null;
        }
        if(left!=null && right!=null)
        {
            return root;
        }
        return left!=null?left:right;
    }
}
