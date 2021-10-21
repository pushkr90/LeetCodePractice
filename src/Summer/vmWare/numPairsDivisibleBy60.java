package Summer.vmWare;

import java.util.HashMap;

public class numPairsDivisibleBy60 {
    public int numPairsDivisibleBy601(int[] time) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=0;

        for(int i=0;i<time.length;i++)
        {
            int remainder=time[i]%60;
            int remainingRemainder= (remainder==0?0:60-remainder);
            if(map.containsKey(remainingRemainder))
            {
                res+=map.get(remainingRemainder);
            }
            map.put(remainder,map.getOrDefault(remainder,0)+1);
        }

        return res;
    }
}
