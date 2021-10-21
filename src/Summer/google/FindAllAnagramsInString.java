package Summer.google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindAllAnagramsInString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char each:p.toCharArray())
        {
           map.put(each,map.getOrDefault(each,0)+1);
        }

        int start=0,end=0,count=map.size();
        while(end<s.length())
        {
            char ch=s.charAt(end);

                if(map.containsKey(ch))
                {
                    map.put(ch,map.get(ch)-1);
                    if(map.get(ch)==0) {
                        count--;
                    }

                }
                end++;


            while(count==0)
            {
                char c=s.charAt(start);
                if(map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);

                    if (map.get(c) > 0) {
                        count++;
                    }
                }
                    if(end-start==p.length())
                    {
                        res.add(start);
                    }
                    start++;

            }


        }
        return res;


    }
}
