package Summer.tesla;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class CountAndSay {
    public String countAndSay(int n)
    {
        String s="1";
        Queue<String> qu=new LinkedList<>();
        qu.offer(s);
       for(int i=1;i<s.length();i++)
       {
           StringBuilder sb=new StringBuilder();
           String curr=qu.poll();
           char c=curr.charAt(0);
           int count=1;
           for(int j=1;j<curr.length();j++)
           {
               if(c==curr.charAt(j))
               {
                   count++;
               }
               else
                   {

                   sb.append(count).append(c);
                   c=curr.charAt(j);
                   count=1;
               }
           }
           sb.append(count).append(c);
           qu.offer(sb.toString());
       }

       return qu.poll().toString();

    }


}
/*
* 4
* 1
* 11
* 21
* 12
* */
