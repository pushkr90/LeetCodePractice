package Summer.ArrayAndHashMap;

import java.util.HashMap;
import java.util.HashSet;

public class NumberOfGoodWaysToSplitAStringHASHMAPSOLUTION {
    public int numSplits(String s)
    {
        int res=0;
        HashMap<Character,Integer> right=new HashMap<>();
        HashMap<Character,Integer> left=new HashMap<>();

        for(char each:s.toCharArray())
        {
            right.put(each,right.getOrDefault(each,0)+1);
        }

        for(char each:s.toCharArray())
        {
            if(right.containsKey(each))
            {
                right.put(each,right.getOrDefault(each,0)-1);
            }
            if(right.get(each)<=0)
            {
                right.remove(each);
            }
            left.put(each,left.getOrDefault(each,0)+1);

            if(left.size()==right.size())
            {
                res++;
            }
        }
        return res;
    }
}
