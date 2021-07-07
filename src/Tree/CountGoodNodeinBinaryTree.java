package Tree;


import Summer.Others.TreeNode;

public class CountGoodNodeinBinaryTree {
    int ans=0;
    public int goodNodes(TreeNode root){
        if(root==null) return ans;
        helper(root,root.val);
        return ans;

    }
    private void helper(TreeNode node,int value)
    {
        if(node==null) return;
        if(node.val>=value) ans++;
        value=Math.max(node.val,value);
        helper(node.left,value);
        helper(node.right,value);
    }
}
