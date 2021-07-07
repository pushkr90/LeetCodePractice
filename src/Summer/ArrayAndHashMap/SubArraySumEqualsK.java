package Summer.ArrayAndHashMap;

import java.util.HashMap;

public class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int cursum=0,res=0;
        for(int i=0;i<nums.length;i++)
        {
            cursum+=nums[i];
            if(map.containsKey(cursum-k))
            {
                res+=map.get(cursum-k);
            }
            map.put(cursum,map.getOrDefault(cursum,0)+1);
        }
        return res;
    }
}
