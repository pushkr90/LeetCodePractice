package Summer.Tree;

import Summer.Others.TreeNode;

import java.util.Stack;

public class ValidateBinaryTree
{
    Stack<TreeNode> stack;
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        stack=new Stack<>();
        TreeNode temp=root;
        TreeNode prev=null;
        while(!stack.isEmpty()||temp!=null)
        {
            while(temp!=null)
            {
                stack.push(temp);
                temp=temp.left;
            }
            temp=stack.pop();
            if(prev!=null && prev.val>=temp.val) return false;
            prev=temp;
            temp=temp.right;

        }
        return true;
    }
}
