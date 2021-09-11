package Summer.google;

public class MaaximumSubArray {
    public int maxSubArray(int[] nums)
    {
        if(nums.length==1) return nums[0];
        int maxSum=nums[0];
        int curSum=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            curSum=Math.max(nums[i],curSum+nums[i]);
            maxSum=Math.max(curSum,maxSum);

        }
        return maxSum;
    }
}
