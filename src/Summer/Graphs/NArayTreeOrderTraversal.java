package Summer.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class NArayTreeOrderTraversal
{
    public List<List<Integer>> levelOrder(Node root)
    {
    List<List<Integer>> res=new ArrayList<>();
        Queue<Node> qu=new LinkedList<>();
        qu.offer(root);

        while(qu.isEmpty())
        {
            int size=qu.size();
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<size;i++)
            {
                Node curr=qu.poll();
                temp.add(curr.val);
                List<Node> li=curr.children;
                for(Node each:li)
                {
                    qu.offer(each);
                }
            }
            res.add(temp);
        }
        return res;


    }
}
