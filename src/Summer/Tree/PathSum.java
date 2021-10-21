package Summer.Tree;

import Summer.Others.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSum {
    boolean found;
    public boolean hasPathSum(TreeNode root, int targetSum)
    {

        return check(root,targetSum,0);

    }
    private boolean check(TreeNode node,int targetSum,int currSum)
    {
        if(node!=null)
        {
            if(node.left==null && node.right==null)
            {
                if(targetSum-node.val==0)
                {
                    return true;
                }
            }
            targetSum-=node.val;
            return check(node.left,targetSum,currSum)||check(node.right,targetSum,currSum);
    }
        return false;
    }

}
