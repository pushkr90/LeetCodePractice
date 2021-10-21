package Summer.Tree;

import Summer.Others.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class FlattenTree {
    List<TreeNode> res;
    public void flatten(TreeNode root) {
        res=new ArrayList<>();
        prepare(root);
        TreeNode n=new TreeNode(res.get(0).val);
        for(int i=0;i<res.size();i++)
        {
            TreeNode node=res.get(i);
            n.right=node;
            n=node;
        }


    }

    private void prepare(TreeNode node)
    {
        res.add(node);
        prepare(node.left);
        prepare(node.right);



    }
}
