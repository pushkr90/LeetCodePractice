package Summer.google;

import java.util.Stack;

public class simplifyPath {
    public String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        String[] arr=path.split("/");

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals("")||arr[i].equals(".")||arr[i].equals("/")) continue;
            else if(arr[i].equals(".."))
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }else{
                stack.push(arr[i]);
            }
        }
        StringBuilder sb=new StringBuilder();
        if(stack.isEmpty())
        {
            return "/";
        }
        while (!stack.isEmpty())
        {
            sb.append("/").append(stack.pop());
        }
return sb.toString();
    }
}
