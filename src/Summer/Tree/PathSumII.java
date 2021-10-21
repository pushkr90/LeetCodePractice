package Summer.Tree;

import Summer.Others.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PathSumII {
    List<List<Integer>> res;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum)
    {
         res=new ArrayList<>();
        if(root==null){
            return res;
        }
        List<Integer> temp=new ArrayList<>();
        helper(temp,targetSum,root);
        return res;
    }
    private void helper(List<Integer>temp,int targetSum,TreeNode node)
    {
        if(node==null) return;
        temp.add(node.val);
        targetSum-=node.val;
        if(node.left==null && node.right==null)
        {
            if(targetSum==0)
            {
                res.add(new ArrayList<>(temp));
            }
        }
        helper(temp,targetSum,node.left);
        helper(temp,targetSum,node.right);


        temp.remove(temp.size()-1);
    }

}
