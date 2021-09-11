package Summer.google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnCommonWordFromTwoSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> res=new ArrayList<>();
        String[] arr1=s1.split(" ");
        String[]arr2=s2.split(" ");

        HashMap<String,Integer> map=new HashMap<>();
        for(String each:arr1)
        {
            map.put(each,map.getOrDefault(each,0)+1);
        }

        for(String each:arr2)
        {
            map.put(each,map.getOrDefault(each,0)+1);
        }

        for(Map.Entry<String,Integer>each:map.entrySet())
        {
            if(each.getValue()==1)
            {
                res.add(each.getKey());
            }
        }

        String[] res1=new String[res.size()];
        for(int i=0;i<res.size();i++)
        {
            res1[i]=res.get(i);
        }
        return res1;
    }
}
