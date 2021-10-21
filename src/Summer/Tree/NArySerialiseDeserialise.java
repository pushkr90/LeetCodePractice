package Summer.Tree;

import java.util.*;

public class NArySerialiseDeserialise
{
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

    public String serialise(Node root)
    {
        List<String> list=new ArrayList<>();
        helper(root,list);
        return String.join(",",list);

    }

    private void helper(Node node,List<String> list)
    {
        if(node==null) return;
        list.add(String.valueOf(node.val));
        int size=node.children.size();
        list.add(String.valueOf(size));
        for(Node each:node.children)
        {
            helper(each,list);
        }
    }

    public Node deserialize(String data)
    {
        String[] s=data.split(",");
        Queue<String> qu=new LinkedList<>(Arrays.asList(s));

        return helper1(qu);

    }

    private Node helper1(Queue<String> qu)
    {
        String s=qu.poll();
        Node n=new Node(Integer.parseInt(s));
        int size=Integer.parseInt(qu.poll());

        for(int i=0;i<size;i++)
        {
            helper1(qu);
        }
        return n;


    }

}
