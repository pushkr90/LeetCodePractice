package Summer.Tree;

import Summer.Others.TreeNode;

public class CountGoodNodesInBinaryTree
{
    private int count=0;
    public int goodNodes(TreeNode root)
    {
        if(root==null) return count;
        dfs(root,root.val);
        return count;

    }

    public void dfs(TreeNode node,int rootVal)
    {
        if(node==null)
        {
            return;
        }
        if(node.val>=rootVal)
        {
            count++;
        }
        dfs(node.left,node.val);
        dfs(node.right,node.val);
    }
}
