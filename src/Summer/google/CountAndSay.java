package Summer.google;

import java.util.LinkedList;
import java.util.Queue;

public class CountAndSay {
    public String countAndSay(int n)
    {
        String s="1";

        Queue<String> qu=new LinkedList<>();
        qu.offer(s);
        for(int i=1;i<n;i++)
        {
            String curr=qu.poll();
            StringBuilder sb=new StringBuilder();
            int count=1;
            char c=curr.charAt(0);
            for(int j=1;j<curr.length();j++)
            {
                if(curr.charAt(j)==c)
                {
                    count++;
                }
                else{
                    sb.append(count).append(c);
                    count=1;
                    c=curr.charAt(j);
                }
            }
            sb.append(count).append(c);
            qu.offer(sb.toString());
        }
        return qu.poll();
    }
}
