package Summer.ArrayAndHashMap;

import java.util.HashSet;

public class CountBinarySubStrings {
    public int countBinarySubstrings(String s)
    {
        int curr=1,prev=0,ans=0,i=1;
        while(i<s.length())
        {
            if(s.charAt(i)!=s.charAt(i-1))
            {

                ans+=Math.min(curr,prev);
                prev=curr;
                curr=1;
            }
            else
                {
            curr++;

            }
            i++;

        }
        return ans+Math.min(curr,prev);



    }
}
