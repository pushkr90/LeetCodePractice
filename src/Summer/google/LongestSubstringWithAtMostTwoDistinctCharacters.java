package Summer.google;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstringWithAtMostTwoDistinctCharacters {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int start=0;
        int end=0;
        int max=Integer.MIN_VALUE;
        int counter=0;
        HashMap<Character,Integer> map=new HashMap<>();
//abacc
        while(end<s.length())
        {
            char c=s.charAt(end);

            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)==1)
            {
                counter++;
            }
            end++;
            while(counter>2)
            {
                char ch=s.charAt(start);
                if(map.containsKey(ch))
                {
                    map.put(ch,map.get(ch)-1);
                    if(map.get(ch)==0)
                    {
                        counter--;
                    }
                }
                start++;
            }
            if(max>end-start)
            {
                max=end-start;
            }

        }
        return max;

    }
}

/*
eceba



*/
