package Summer.Tree;

import Summer.Others.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView
{
    List<Integer> res=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root)
    {
        Queue<TreeNode> qu=new LinkedList<>();
        //res.add(root.val);
        qu.offer(root);
        while(!qu.isEmpty())
        {
            int size=qu.size();

            List<TreeNode> res1=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode curr=qu.poll();
                if(i==0)
                {
                    res.add(curr.val);
                }
                if(curr.right!=null)
                {
                    qu.offer(curr.right);
                    res1.add(curr.right);
                }
                if(curr.left!=null)
                {
                    qu.offer(curr.left);
                    res1.add(curr.left);

                }

            }

        }

        return res;

    }
}
