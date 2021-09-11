package Summer.ArrayAndHashMap;

public class consecutivenumbersum
{
    public int consecutiveNumbersSum(int n)
    {
        int count=0;
        int max=(n+1)/2;
            for(int i=1;i<max;i++)
        {
            int sum=0;
            for(int j=i;j<max;j++)
            {
                sum+=j;
                if(sum==n) count++;
            }
        }
            return count;
    }
}
