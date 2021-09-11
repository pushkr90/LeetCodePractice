package Summer.google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sortCharacterByFrequency {
    public String frequencySort(String s) {

        HashMap<Character,Integer>map=new HashMap<>();
        for(char each:s.toCharArray())
        {
            map.put(each,map.getOrDefault(each,0)+1);
        }

        List<Character>[] bucket=new List[s.length()+1];

        for(Map.Entry<Character,Integer> each:map.entrySet())
        {
            int freq=each.getValue();
            if(bucket[freq]==null)
            {
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(each.getKey());
        }

        StringBuilder sb=new StringBuilder();
        for(int i=bucket.length-1;i>=0;i--)
        {
            if(bucket[i]!=null)
            {
                for(char c:bucket[i])
                {
                    for(int j=0;j<map.get(c);j++)
                    {
                        sb.append(c);
                    }
                }
            }
        }

        return sb.toString();
    }
}
