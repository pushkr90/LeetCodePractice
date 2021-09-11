package Summer.tesla;

import java.util.HashSet;

public class LongestSubStringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int res=0;

        HashSet<Character> set=new HashSet<>();
        int i=0,j=0;

        while(i<s.length() &&j <s.length())
        {
            if(!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j));
                j++;
            }
            else{
                set.remove(s.charAt(i++));
                res=Math.max(res,j-i);

            }
        }
        return res;


    }
}
