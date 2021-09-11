package Summer.tesla;

public class SumArrayLessThanK {
    public int lessThan(int[] arr,int k)
    {
        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=k)
            {
                res++;
            }
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]<=k)
                {
                    res++;
                }
            }
        }
        return res;
    }
}
/*
1234 4

*/
