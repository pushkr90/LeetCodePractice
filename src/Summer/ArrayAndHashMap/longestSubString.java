package Summer.ArrayAndHashMap;

import java.util.HashMap;
import java.util.HashSet;

public class longestSubString {
    public int lengthOfLongestSubstring(String s)
    {
        HashSet<Character> set=new HashSet<>();
        int maxlen=0;
        int start=0,end=0;
        while(end<s.length())
        {
            if(!set.contains(s.charAt(end)))
            {
                set.add(s.charAt(end));
                maxlen=Math.max(maxlen,end-start+1);
                end++;
            }
            else{

                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxlen;

    }
}
