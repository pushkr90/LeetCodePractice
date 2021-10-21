package Summer.Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
    public Node connect(Node root) {

        Queue<Node>qu=new LinkedList<>();

        qu.offer(root);
        while(!qu.isEmpty())
        {
            int size=qu.size();

            for(int i=0;i<size;i++)
            {
                Node curr=qu.poll();
                if(i==size-1)
                {
                    curr.next=null;
                }
                else {
                    curr.next = qu.peek();
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
        return root;

    }
}
