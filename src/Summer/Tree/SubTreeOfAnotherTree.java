package Summer.Tree;

import Summer.Others.TreeNode;

public class SubTreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root==null)
            return false;
        if (subRoot==null)
            return true;
        return match(root,subRoot) || isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);

    }
    private boolean match(TreeNode node,TreeNode subRoot)
    {
        if(node==null && subRoot==null) return true;
        if(node==null ||subRoot==null) return false;
        if(node.val!=subRoot.val) return false;
        return match(node.left,subRoot.left) && match(node.right,subRoot.right);
    }
}
