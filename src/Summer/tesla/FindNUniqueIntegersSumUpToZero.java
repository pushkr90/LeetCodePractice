package Summer.tesla;

public class FindNUniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
        int[] res=new int[n];

        for(int i=0;i<n;i++)
        {
            res[i]=i;
            res[0]-=i;
        }
        return res;

    }
}
