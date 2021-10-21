package Summer.GOOGLELEETCODEEXPLORER;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s)
    {

        Stack<String> strStack=new Stack<>();
        Stack<Integer> intStack=new Stack<>();

        int i=0;
        String res="";
        while(i<s.length())
        {
            if(Character.isDigit(s.charAt(i)))
            {
                int count=0;
                while(Character.isDigit(s.charAt(i)))
                {
                    count=count*10+s.charAt(i)-'0';
                    i++;
                }
                intStack.push(count);
            }
            else if(s.charAt(i)=='(')
            {
                strStack.push(res);
                res="";
                i++;
            }
            else if(s.charAt(i)==')')
            {
                StringBuilder sb=new StringBuilder(strStack.pop());
                int repeart=intStack.pop();
                for(int j=0;j<repeart;j++)
                {
                    sb.append(res);
                }
                res=sb.toString();
                i++;
            }
            else{
                res+=s.charAt(i++);
            }
        }
        return res;
    }
}
