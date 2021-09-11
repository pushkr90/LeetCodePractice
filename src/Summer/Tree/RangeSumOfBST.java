package Summer.Tree;

import Summer.Others.TreeNode;

public class RangeSumOfBST {
    private int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        helper(root,low,high);
        return sum;
    }

    private void helper(TreeNode node,int low,int high)
    {
        if(node==null) return;
        if(node.val>=low ||node.val<=high)
        {
            sum+=node.val;
        }
        helper(node.left,low,high);
        helper(node.right,low,high);
    }
}
