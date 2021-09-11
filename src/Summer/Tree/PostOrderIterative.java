package Summer.Tree;

import Summer.Others.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class PostOrderIterative {
    List<Integer>res=new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {

        Stack<TreeNode>stack=new Stack<>();

        TreeNode curr=root;
        while(curr!=null || !stack.isEmpty())
        {
            while(curr!=null)
            {
                res.add(curr.val);
                stack.push(curr);
                curr=curr.right;
            }
            curr=stack.pop();
            curr=curr.left;

        }
        Collections.reverse(res);
        return res;
    }
}
