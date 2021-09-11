package Summer.ArrayAndHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NumberOfMatchingSubsequences {
    public int numMatchingSubseq(String s, String[] words)
    {
        HashMap<Character,List<Integer>> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {

            if(!map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),new ArrayList<>());
            }
            map.get(s.charAt(i)).add(i);
        }

        //int max=-1;
        boolean found=true;
        int res1=0;

        for(String each:words)
        {
            found=true;
            int max=-1;
            for(int i=0;i<each.length();i++)
            {
                char c=each.charAt(i);
                if(map.containsKey(c))
                {
                    List<Integer> res=map.get(c);
                    int temp=max;
                    for(int j=0;j<res.size();j++)
                    {
                        if(res.get(j)>max)
                        {
                            max=Math.max(max,res.get(j));
                            break;
                        }
                    }
                    if(temp==max)
                    {
                        found=false;
                    }
                }
                else
                {
                    found=false;
                }
            }
            if(found)
            {
                res1++;
            }
        }
        return res1;


    }
}
