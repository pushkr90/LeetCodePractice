package Summer.Tree;

import Summer.Others.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderIterative {
    List<Integer> res=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root)
    {
        Stack<TreeNode>stack=new Stack<>();

        TreeNode curr=root;
        while(curr!=null || !stack.isEmpty())
        {
            while(curr!=null)
            {
                res.add(curr.val);
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            curr=curr.right;

        }
        return res;

    }
}
