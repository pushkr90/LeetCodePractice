package Summer.ArrayAndHashMap;

public class RevisionMaximumSubArray
{
    public int maxSubArray(int[] nums)
    {
        int j=0;
        int maxsum=nums[0];
        int cursum=nums[0];

        for(int i=0;i<nums.length;i++)
        {
            cursum=Math.max(nums[i],cursum);
            maxsum=Math.max(cursum,maxsum);

        }
        return maxsum;

    }
}
/*

[-2,1,-3,4,-1,2,1,-5,4]


*/
