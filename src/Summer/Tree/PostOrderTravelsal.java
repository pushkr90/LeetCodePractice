package Summer.Tree;

import Summer.Others.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrderTravelsal {
    public List<Integer> postorderTraversal(TreeNode root)
    {
        List<Integer> res=new ArrayList<>();
        dfs(root,res);
        return res;
    }
    private void dfs(TreeNode node,List<Integer> res)
    {
        if(node==null) return;
        dfs(node.left,res);
        dfs(node.right,res);
        res.add(node.val);
    }
}
