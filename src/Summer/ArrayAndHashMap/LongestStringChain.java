package Summer.ArrayAndHashMap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

import static com.sun.xml.internal.xsom.impl.UName.comparator;

public class LongestStringChain {
    public int longestStrChain(String[] words)
    {
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });


        int res=0;
        HashMap<String,Integer> map=new HashMap<>();

        for(String each:words)
        {
            map.put(each,1);
            for(int i=0;i<each.length();i++)
            {
                StringBuilder sb=new StringBuilder(each);
                String newString=sb.deleteCharAt(i).toString();
                if(map.containsKey(newString))
                {
                    map.put(newString,Math.max(map.get(each),map.get(newString)+1));
                }
            }
            res=Math.max(res,map.get(each));
        }
        return res;
    }
}
