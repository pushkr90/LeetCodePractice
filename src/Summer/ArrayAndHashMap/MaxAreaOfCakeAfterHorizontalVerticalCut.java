package Summer.ArrayAndHashMap;

public class MaxAreaOfCakeAfterHorizontalVerticalCut {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
    int maxHorizontalHeight=Math.max(horizontalCuts[0]-0,h-horizontalCuts[horizontalCuts.length-1]);
    int maxVerticalHeight=Math.max(verticalCuts[0]-0,w-verticalCuts[verticalCuts.length-1]);

    for(int i=1;i<horizontalCuts.length;i++)
    {
        maxHorizontalHeight=Math.max(maxHorizontalHeight,horizontalCuts[i]-horizontalCuts[i-1]);
    }
    for(int j=1;j<verticalCuts.length;j++)
    {
        maxVerticalHeight=Math.max(maxVerticalHeight,verticalCuts[j]-verticalCuts[j-1]);
    }
    long area=maxHorizontalHeight*maxVerticalHeight;
    return (int)area;
    }
}
