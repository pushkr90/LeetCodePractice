package Summer.GOOGLELEETCODEEXPLORER;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int max=0;
        while(start<end)
        {

            if(height[start]>height[end])
            {
                max=Math.max(max,((end-start)*height[end]));
                end--;
            }
            else{
                max=Math.max(max,((end-start)*height[start]));
                start++;
            }

        }
        return max;

    }
}
