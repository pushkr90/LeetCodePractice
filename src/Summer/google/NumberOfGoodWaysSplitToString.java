package Summer.google;

import java.util.HashMap;

public class NumberOfGoodWaysSplitToString {
    public int numSplits(String s)
    {
        HashMap<Character,Integer> right=new HashMap<>();
        HashMap<Character,Integer> left=new HashMap<>();

        for(char each:s.toCharArray())
        {
            right.put(each,right.getOrDefault(each,0)+1);
        }
        int res=0;

        for(char each:s.toCharArray())
        {
            if(right.containsKey(each))
            {
                right.put(each,right.get(each)-1);
            }
            if(right.get(each)<=0)
            {
                right.remove(each);
            }

            left.put(each,left.getOrDefault(each,0)+1);
            if(right.size()==left.size())
            {
                res++;
            }
        }

        return res;
    }
}
