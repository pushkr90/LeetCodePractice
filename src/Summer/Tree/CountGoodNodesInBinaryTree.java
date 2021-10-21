package Summer.Tree;

import Summer.Others.TreeNode;

public class CountGoodNodesInBinaryTree
{
    private int res;
    public int goodNodes(TreeNode root)
    {
        res=0;
        check(root,root.val);
        return res;
    }

    private void check(TreeNode curr,int parent)
    {
        if(curr==null) return;
        if( parent<=curr.val)
        {
            res++;
        }
        int max=Math.max(curr.val,parent);
        check(curr.left,max);
        check(curr.right,max);
    }
}
