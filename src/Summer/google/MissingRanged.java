package Summer.google;

import java.util.ArrayList;
import java.util.List;

public class MissingRanged {
    public List<String> findMissingRanges(int[] nums, int lower, int upper)
    {
        List<String> res=new ArrayList<>();
        if(nums.length==0)
        {
            addRange(lower,upper, res);
            return res;
        }

        int start=lower;
        for(int end:nums)
        {
            if(start<end)
            {
                addRange(start,end-1,res);
            }
            start=end+1;


        }
        if(start<=upper)
        {
            addRange(start,upper,res);
        }
        return res;



    }

    private void addRange(int start,int end,List<String> res)
    {
        if(start==end)
        {
            res.add(String.valueOf(start));
            return;
        }

        res.add(start+"->"+end);
        return;
    }
}
