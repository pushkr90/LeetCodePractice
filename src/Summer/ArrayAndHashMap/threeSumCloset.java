package Summer.ArrayAndHashMap;

import java.util.Arrays;

public class threeSumCloset {
    public int threeSumClosest(int[] nums, int target)
    {
        int closetSum=nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);

        for(int i=0;i+2<nums.length;i++)
        {

            int j=i+1;
            int k=nums.length-1;

            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>target)
                {
                    k--;
                }
                else{
                    j++;

                }
                if(Math.abs(target-sum)< Math.abs(target-closetSum))
                {
                    closetSum=sum;
                }
            }
        }

        return closetSum;
    }
}
