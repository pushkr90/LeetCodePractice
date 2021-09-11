package Summer.google;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class LongestStringChain {
    public int longestStrChain(String[] words)
    {
        int res=0;
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });


        HashMap<String,Integer> map=new HashMap<>();
        for(String each:words)
        {
            map.put(each,1);
            for(int i=0;i<each.length();i++)
            {
                StringBuilder sb=new StringBuilder(each);
                sb.deleteCharAt(i);
                String word=sb.toString();
                if(map.containsKey(word))
                {
                    map.put(each,Math.max(map.get(word)+1,map.get(each)));
                }
            }
            res=Math.max(res,map.get(each));
        }
        return res;
    }
}
