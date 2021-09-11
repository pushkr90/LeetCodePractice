package Summer.google;

import java.util.HashMap;
import java.util.HashSet;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char each:t.toCharArray())
        {
            map.put(each,map.getOrDefault(each,0)+1);
        }
        int count=map.size();
        int start=0;
        int end=0;
        int min=Integer.MAX_VALUE;
        int headStart=0;
        String sb= new String();
        while(end<s.length())
        {
            char c=s.charAt(end);
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)-1);
                if(map.get(c)==0)
                {
                    count--;
                }
            }
            end++;
            while(count==0)
            {
                char a=s.charAt(start);
                if(map.containsKey(a))
                {
                    map.put(a,map.get(a)+1);
                    if(map.get(a)>0)
                    {
                        count++;
                    }
                }
                if(min>end-start)
                {
                    min=end-start;
                    headStart=start;
                }
                start++;
            }
        }

        if(min==Integer.MAX_VALUE)
        {
            return "";
        }
        return s.substring(headStart,headStart+min);
    }
}

/*
s = "ADOBECODEBANC", t = "ABC"
*
/