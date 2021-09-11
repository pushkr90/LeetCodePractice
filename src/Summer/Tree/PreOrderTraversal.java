package Summer.Tree;

import Summer.Others.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal {
    List<Integer> list=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root)
    {
        if(root==null) return list;
        TreeNode curr=root;
        list.add(curr.val);
        if(curr.left!=null)
        {
            preorderTraversal(curr.left);
        }
        if(curr.right!=null)
        {
            preorderTraversal(curr.right);

        }
        return list;
    }
}
