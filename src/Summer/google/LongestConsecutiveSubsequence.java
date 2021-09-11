package Summer.google;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public int longestConsecutive(int[] nums)
    {
        int res=0;
        HashSet<Integer> set=new HashSet<>();
        for(int each:nums)
        {
            set.add(each);
        }


        for(int i=0;i<nums.length;i++)
        {
            int val=nums[i];
            int logest=0;
            while(check(val+1,set))
            {
                val=val+1;
                logest++;
                res=Math.max(logest,res);

            }
        }
        return res;
    }
    private boolean check(int val, HashSet<Integer>set)
    {
        if(set.contains(val))
        {
            return true;
        }
        return false;
    }
}
