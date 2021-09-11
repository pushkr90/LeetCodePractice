package Summer.google;

public class MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves {
    public int minDifference(int[] nums)
    {

        int min=Integer.MAX_VALUE;
        int n=nums.length;
        if(n<5) return 0;
        for(int i=0;i<4;i++)
        {
            min=Math.min(min,nums[n-4+i]-nums[i]);
        }
        return min;
    }
}
