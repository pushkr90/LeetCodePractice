package Summer.google;

import java.util.Stack;

public class RemoveAllAdjacentsDuplicatesInStringTWO
{
    public String removeDuplicates(String s, int k)
    {
        Stack<pair> stack=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if(stack.isEmpty()||s.charAt(i)!=stack.peek().c)
            {
                stack.push(new pair(1,s.charAt(i)));

            }else{
                if(++stack.peek().count==k)
                {
                    stack.pop();
                }
            }

        }

        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty())
        {
            pair p=stack.pop();
            for(int i=0;i<p.count;i++)
            {
                sb.append(p.c);
            }
        }
        sb.reverse();
        return sb.toString();

    }

    class pair{
        int count;
        char c;
        public pair(int count,char c)
        {
            this.count=count;
            this.c=c;
        }
    }
}
