package Summer.google;

import java.util.ArrayList;
import java.util.List;

public class FindPairInTwoUnsortedArraysSumEqualsK {
    public List<int[]> pair(int[] arr1, int []arr2,int target)
    {
        List<int[]> res=new ArrayList<>();

        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                int[] re=new int[2];
                if(arr1[i]+arr2[j]==target)
                {
                    re[0]=arr1[i];
                    re[1]=arr2[j];
                    res.add(re);
                }
            }
        }
        return res;

    }
}
