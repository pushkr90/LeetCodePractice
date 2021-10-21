package Summer.google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0;i<nums.length-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;

           // int j=i+1;
            for( int j=i+1;j<nums.length-2;j++)
            {
                int start=j+1;
                int end=nums.length-1;

                while (start<end)
                {
                    if(nums[i]+nums[j]+nums[start]+nums[end]==target)
                    {
                        res.add(Arrays.asList(nums[i],nums[j],nums[start],nums[end]));

                        start++;
                        end--;
                        while(start<end && nums[start]==nums[start-1])
                        {
                            start++;
                        }
                        while(start<end && nums[end]==nums[end-1])
                        {
                            end--;
                        }
                    }
                    else{
                        if(nums[i]+nums[j]+nums[start]+nums[end]>target)
                        {
                            end--;
                        }
                        else{
                            start++;
                        }
                }
                }
            }
        }
        return res;
    }
}
