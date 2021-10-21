package Summer.GOOGLELEETCODEEXPLORER;

import Summer.Others.TreeNode;
import sun.reflect.generics.tree.Tree;

public class DiameterOfBinaryTree {
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root)
    {
        if(root==null) return diameter;

        helper(root);
        return diameter;
    }

    private int helper(TreeNode node)
    {
        if(node==null) return 0;
        int left= helper(node.left);
        int right=helper(node.right);
        diameter=Math.max(diameter,left+right);
        return 1+Math.max(left,right);


    }
}
