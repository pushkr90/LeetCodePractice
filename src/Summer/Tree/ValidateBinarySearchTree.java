package Summer.Tree;

import Summer.Others.TreeNode;
import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Stack;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if(root==null) return false;
       return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private boolean check(TreeNode root,int left,int right)
    {
        if(root==null) return true;
        if(root.val<=left ||root.val>=right)
        {
            return false;
        }

        return check(root.left,left,root.val) && check(root.right,root.val,right);
    }
}
