package Summer.google;

public class JumpGame {
    public boolean canJump(int[] nums)
    {
        int lastGoodPosition=nums.length-1;
        for(int i=nums.length;i>=0;i--)
        {
            if(i+nums[lastGoodPosition]>=lastGoodPosition)
            {
                lastGoodPosition=i;
            }
        }

        return lastGoodPosition==0;

    }
}
