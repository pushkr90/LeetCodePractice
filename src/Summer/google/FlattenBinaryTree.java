package Summer.google;

import Summer.Others.TreeNode;

import java.util.Stack;

public class FlattenBinaryTree {
    public void flatten(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);

        while(!stack.isEmpty())
        {
            TreeNode curr=stack.pop();
            if(curr.right!=null)
            {
                stack.push(curr.right);
            }
            if(curr.left!=null)
            {
                stack.push(curr.left);
            }
            if(!stack.isEmpty())
            {
                curr.right=stack.peek();
            }
            curr.left=null;
        }
    }
}
