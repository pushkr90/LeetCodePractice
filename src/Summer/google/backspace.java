package Summer.google;

import java.util.Stack;

public class backspace {
    Stack<Character> stack1=new Stack<>();
    Stack<Character> stack=new Stack<>();
    public boolean backspaceCompare(String s, String t) {
for(char each:s.toCharArray())
    {
        if(each=='#' && !stack.isEmpty())
        {
            stack.pop();
        }else if(each!='#'){
            stack.push(each);
        }
    }

for(char each:t.toCharArray())
    {
        if(each=='#'&&!stack1.isEmpty())
        {
            stack1.pop();
        }else if(each!='#'){
            stack1.push(each);
        }
    }

while(!stack.isEmpty() && !stack1.isEmpty())
    {
        char c=stack.pop();
        char a=stack1.pop();
        if(a!=c)
        {
            return false;
        }
    }
return stack.isEmpty()&&stack1.isEmpty()?true:false;
}}
