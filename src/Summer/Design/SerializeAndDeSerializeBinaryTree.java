package Summer.Design;


import Summer.Others.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializeAndDeSerializeBinaryTree
{

    public String serialize(TreeNode root)
    {
    StringBuilder sb=new StringBuilder();
        if(root==null)
        {
            return "";
        }
        helper(root,sb.append(root.val));
        return sb.toString();
    }

    public void helper(TreeNode node,StringBuilder sb)
    {
        if(node.left==null && node.right==null) return;
        if(node==null)
        {
            sb.append("null,");
        }
        helper(node.left,sb.append(node.left.val).append(","));
        helper(node.right,sb.append(node.right.val).append(","));
    }
    public TreeNode deserialize(String data)
    {
       String[] str= data.split(",");
       List<String> list= Arrays.asList(str);

       return helperde(list);
     }
    private TreeNode helperde(List<String> list)
    {
        if(list.get(0).equals("null"))
        {
            list.remove(0);
        }
        TreeNode node=new TreeNode(Integer.parseInt(list.get(0)));
        list.remove(0);
        node.left=helperde(list);
        node.right=helperde(list);
        return node;

    }



}
