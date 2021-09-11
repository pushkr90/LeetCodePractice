package Summer.ArrayAndHashMap;

public class MaxPointsToBeAttainedFromCards {
    public int maxScore(int[] cardPoints, int k)
    {
        int sum=0,maxSum=0;
        int left=0,right=cardPoints.length-1;
        for(int i=0;i<k;i++)
        {
            sum+=cardPoints[i];
        }
        maxSum=sum;
        for(int i=0;i<k;i++)
        {
            sum-=cardPoints[left++];
            sum+=cardPoints[right--];

            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
