package Summer.Tree;

import Summer.Others.TreeNode;

import java.util.Stack;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root)
    {
        return helper(root,Long.MIN_VALUE,Long.MAX_VALUE);

    }

    private boolean helper(TreeNode root,long left,long right)
    {
        if(root==null) return true;

        if(root.val<=left ||root.val>=right ) return false;

        return helper(root.left,left,root.val) && helper(root.right,root.val,right);
    }
}
