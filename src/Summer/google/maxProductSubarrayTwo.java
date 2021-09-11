package Summer.google;

public class maxProductSubarrayTwo {
    public int maxSubArray(int[] nums)
    {
        int max=Integer.MIN_VALUE;

        int product=1;
        for(int i=0;i<nums.length;i++)
        {
            product =nums[i]*product;
            max=Math.max(product,max);
            if(product==0){product=1;
            }
        }
        product=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            product=nums[i]*product;
            max=Math.max(product,max);
            if(product==0){product=1;}
        }
        return max;
    }
}
