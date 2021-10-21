package Summer.Tree;

import Summer.Others.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();

        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);

        while(!qu.isEmpty())
        {
            int size=qu.size();

            for(int i=0;i<size;i++)
            {
                TreeNode curr=qu.poll();
                if(size-i==1)
                {
                    res.add(curr.val);
                }
                if(curr.left!=null)
                {
                    qu.offer(curr.left);
                }
                if(curr.right!=null)
                {
                    qu.offer(curr.right);
                }
            }
        }
        return res;

    }
}
