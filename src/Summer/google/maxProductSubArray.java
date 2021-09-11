package Summer.google;

public class maxProductSubArray {
    public int maxProduct(int[] nums)
    {

        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int local=nums[i]*nums[j];
                max=Math.max(max,local);
            }
        }
        return max;

    }
}
/*
* [2,3,-2,4]
*
* */
