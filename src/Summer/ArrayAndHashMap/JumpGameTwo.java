package Summer.ArrayAndHashMap;

public class JumpGameTwo {
    public int jump(int[] nums) {
        int left=0,right=0;
        int res=0;
        while(right<nums.length)
        {
            int farthest=0;
            for(int i=left;i<right+1;i++)
            {
                farthest=Math.max(farthest,i+nums[i]);
            }
            left=right+1;
            right=farthest;
            res++;

        }

        return res;
    }

}
