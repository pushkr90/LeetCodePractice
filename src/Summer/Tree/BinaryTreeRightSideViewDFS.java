package Summer.Tree;

import Summer.Others.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideViewDFS {
    private int max=-1;
    List<Integer> res;
    public List<Integer> rightSideView(TreeNode root) {

        res=new ArrayList<>();
        if(root==null) return res;

        res.add(root.val);
        dfs(root,0);
        return res;

    }

    private void dfs(TreeNode node,int level)
    {
        if(node.right!=null && level>max)
        {
            max=Math.max(max,level);
            res.add(node.right.val);

        }

        if(node.right==null&&node.left!=null && level>max)
        {
            max=Math.max(max,level);
            res.add(node.left.val);

        }
        if(node.right!=null)
        {
            dfs(node.right,level+1);
        }
        if(node.left!=null)
        {
            dfs(node.left,level+1);
        }

    }
}
