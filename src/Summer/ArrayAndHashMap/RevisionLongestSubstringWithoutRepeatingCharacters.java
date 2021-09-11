package Summer.ArrayAndHashMap;

import java.util.HashSet;
//pwwkew
public class RevisionLongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s)
    {
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int sum=0;
        int maxSum=0;
        for(int j=0;j<s.length();j++)
        {
            if(!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j));
                sum++;
            }
            else {
                maxSum=Math.max(sum,maxSum);
                set.remove(s.charAt(i));
                j=i+1;
            }
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
