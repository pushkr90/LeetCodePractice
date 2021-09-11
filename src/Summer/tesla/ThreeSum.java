package Summer.tesla;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i+2<nums.length;i++)
        {
            int j=i+1;

            int k=-nums.length-1;
            int target=-nums[i];

            while(j<k)
            {

                if(nums[i]+nums[j]+nums[k]==0)
                {
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j+1])
                    {
                        j++;
                    }
                    while(j<k && nums[k]==nums[k-1])
                    {
                        k--;
                    }
                }


                else{
                    if(nums[j]+nums[k]>target)
                    {
                        k--;
                    }
                    else{
                        j++;
                    }

                }
            }
        }
        return res;
    }
}
