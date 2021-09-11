package Summer.Tree;

import Summer.Others.TreeNode;

public class UnivalueLongest {
    int max=0;
    public int longestUnivaluePath(TreeNode root) {
        helper(root,root.val);
        return max;

    }
    private int helper(TreeNode root, int val)
    {
        if(root ==null) return 0;
        int left=helper(root.left,root.val);
        int right=helper(root.right,root.val);
        max=Math.max(left+right,max);
        if(root.val==val)
        {
            return Math.max(left,right)+1;

        }
        return 0;
    }
}
