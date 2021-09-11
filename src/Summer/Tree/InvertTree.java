package Summer.Tree;

import Summer.Others.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class InvertTree {

    public TreeNode invertTree(TreeNode root)
    {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            TreeNode curr= queue.poll();
            TreeNode left=curr.left;
            curr.left=curr.right;
            curr.right=left;
            if(curr.left!=null)
            {
                queue.offer(curr.left);
            }
            if(curr.right!=null)
            {
                queue.offer(curr.right);
            }

        }
        return root;
    }
}
