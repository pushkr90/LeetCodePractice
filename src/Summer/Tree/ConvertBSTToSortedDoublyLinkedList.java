package Summer.Tree;

import Summer.Others.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
}
public class ConvertBSTToSortedDoublyLinkedList {
    public Node treeToDoublyList(Node root)
    {
        List<Node> list=new ArrayList<>();
        Stack<Node> stack=new Stack<>();
        Node curr=root;
        while(curr!=null ||!stack.isEmpty())
        {
            while(curr.left!=null)
            {
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            list.add(curr);
            curr=curr.right;
        }
        Node dummy=(list.get(0));
        Node head=dummy;
        for(int i=1;i<list.size();i++)
        {
            Node node=list.get(i);//
            node.left=dummy;//2->1
            dummy.right=node;//1->2
            dummy=node;//2,3,4,5
        }
        dummy.right=head;
        head.left=dummy;
        return head;
    }
}
