package Summer.Tree;

import java.util.ArrayList;
import java.util.List;
public class ConvertBinarySearchTreeToDoublyLinkedList {
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}

    public Node treeToDoublyList(Node root)
    {
        List<Integer> res=new ArrayList<>();
        dfs(root,res);

        Node first=new Node(res.get(0));
        Node head=first;
        for(int i=1;i<res.size();i++)
        {
            Node naya=new Node(res.get(i));//2 3
            first.right=naya;//1->2->3
            naya.left=first;//1<-2
            first=naya;//5

        }
        first.right=head;
        head.left=first;
        return head;


    }
    private void dfs(Node node, List<Integer> res)
    {
        if(node==null) return;
        dfs(node.left,res);
        res.add(node.val);
        dfs(node.right,res);

    }
}
