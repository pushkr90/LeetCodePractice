package Summer.ArrayAndHashMap;

public class TrappingOfRainWater {
    public int trap(int[] height)
    {
        if(height.length==0) return 0;


        int right=height.length-1;int rightMax=0;
        int left=0;int leftMax=0;
        int total=0;


        while(left<right)

        {
            if(height[right]>rightMax)
            {
                rightMax=height[right];
            }
            if(height[left]>leftMax)
            {
                leftMax=height[left];
            }

            if(leftMax<rightMax)
            {
                total+=Math.max(0,leftMax-height[left]);
                left++;
            }
            else{
                total+=Math.max(0,rightMax-height[right]);
                right--;
            }

        }
        return total;
    }
}
