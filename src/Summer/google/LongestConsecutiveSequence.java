package Summer.google;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums)
    {
        int longest=0;
        HashSet<Integer> set=new HashSet<>();
        for(int each:nums)
        {
            set.add(each);
        }
        for(int i=0;i<nums.length;i++)
        {
            int val=nums[i];
            int res=0;
            if(!set.contains(val-1))
            {
            while(helper(val+1,set))
            {
                val++;
                res++;

                longest=Math.max(longest,res);
            }}

        }
        return longest;
    }

    private boolean helper(int val,HashSet<Integer>set){
        if(set.contains(val))
        {
            return true;
        }
        return false;
    }
}
