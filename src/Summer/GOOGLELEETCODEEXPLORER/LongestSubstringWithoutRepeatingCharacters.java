package Summer.GOOGLELEETCODEEXPLORER;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters
{
    public int lengthOfLongestSubstring(String s)
    {
        HashSet<Character> set=new HashSet<>();
        int start=0,end=0,res=0;
        while(start<s.length() && end<s.length())
        {
            if(!set.contains(s.charAt(end)))
            {
                set.add(s.charAt(end++));
                res=Math.max(res,end-start+1);
            }
            else{
                set.remove(s.charAt(start));
                start++;
            }

        }
        return res;

    }
}

//abcbc
