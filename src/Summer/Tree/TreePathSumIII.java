package Summer.Tree;

import Summer.Others.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TreePathSumIII
{
    int res;
    public int pathSum(TreeNode root, int targetSum) {
        res=0;
        List<Integer> temp=new ArrayList<>();

        helper(temp,root,targetSum);
        return res;

    }
    private void helper(List<Integer> temp,TreeNode root,int targetSum)
    {
        if(root==null) return;

        temp.add(root.val);
        helper(temp,root.left,targetSum);
        helper(temp,root.right,targetSum);
        int sum=0;
        for(int i=temp.size()-1;i>=0;i--)
        {
            sum+=temp.get(i);
            if(sum==targetSum)
            {
                res++;
            }

        }
        temp.remove(temp.size()-1);
    }
}
