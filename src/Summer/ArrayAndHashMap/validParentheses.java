package Summer.ArrayAndHashMap;

import java.util.LinkedList;
import java.util.Stack;

public class validParentheses {
    public boolean isValid(String s) {
        Stack<Character> s1=new Stack<>();
        for(char each:s.toCharArray())
        {
            if(each=='('||each=='{'||each=='[')
            {
                s1.push(each);
            }
            else{
                if(!s1.isEmpty() && check(s1.peek(),each))
                {
                    s1.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        return (s1.isEmpty());

    }
    public boolean check(char left,char right)
    {
        return(left=='[' && right==']' ||left=='(' && right==')' ||left=='{' && right=='}');
    }
}
