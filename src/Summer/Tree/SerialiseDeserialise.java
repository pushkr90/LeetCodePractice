package Summer.Tree;

import Summer.Others.TreeNode;

public class SerialiseDeserialise {
    public String serialise(TreeNode node)
    {
        StringBuilder sb=new StringBuilder();
        helper(sb,node);
        return sb.toString();
    }
    private void helper(StringBuilder sb,TreeNode node)
    {
        if(node==null)
        {
        sb.append("null");
        return;
        }
        sb.append(node.val);
        helper(sb,node.left);
        helper(sb,node.right);

    }
    TreeNode node;

    public TreeNode deserialise(String data)
    {
        String[] str=data.split(",");
        boolean flip=true;

       for(int i=0;i<str.length;i++)
        {

            String s=str[i];
            if(s!=null)
            {
                int val=Integer.parseInt(s);
                node=new TreeNode(val);
            }
            if(flip)
            {
            node=node.left;
            }
            else{
                node=node.right;
            }
            flip=!flip;


        }
       return node;

    }


}
