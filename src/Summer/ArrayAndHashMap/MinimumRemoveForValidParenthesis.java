package Summer.ArrayAndHashMap;

import java.util.HashSet;
import java.util.Stack;

public class MinimumRemoveForValidParenthesis {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack=new Stack<>();
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stack.push(i);
            }
            else if(s.charAt(i)==')')
            {
                stack.pop();
            }
            else if(stack.isEmpty() && s.charAt(i)=='(')
            {
                set.add(i);
            }
        }
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(!set.contains(i))
            {
                sb.append(s.charAt(i));
            }

        }

        return sb.toString();



    }
}
