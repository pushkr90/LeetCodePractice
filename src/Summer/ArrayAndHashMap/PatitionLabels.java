package Summer.ArrayAndHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PatitionLabels
{
    public List<Integer> partitionLabels(String s)
    {

        List<Integer> res=new ArrayList<>();

        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),i);
        }

        int j=0;
        int k=0;
        for(int i=0;i<s.length();i++)
        {
           j=Math.max(j,map.get(s.charAt(i)));
           if(i==j)
           {
               res.add(j-k);
               k=j+1;
           }
        }
        return res;
    }
}
