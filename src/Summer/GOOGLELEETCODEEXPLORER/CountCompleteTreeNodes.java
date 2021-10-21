package Summer.GOOGLELEETCODEEXPLORER;

import Summer.Others.TreeNode;

public class CountCompleteTreeNodes {
    int res;
    public int countNodes(TreeNode root){
         res=0;
        if(root==null) return 0;
        traverse(root);
        return res;
    }

    private void traverse(TreeNode root)
    {
        if(root!=null){
            res++;
        }
        if(root==null) return ;
        traverse(root.left);
        traverse(root.right);

    }
}
