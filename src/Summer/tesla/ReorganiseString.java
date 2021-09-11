package Summer.tesla;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class ReorganiseString {
    public String reorganizeString(String s)
    {
        HashMap<Character,Integer> map=new HashMap<>();

        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }

       PriorityQueue<Character> pq=new PriorityQueue<>(new Comparator<Character>() {
           @Override
           public int compare(Character o1, Character o2) {
               return map.get(o2)-map.get(o1);
           }
       });
        pq.addAll(map.keySet());
        StringBuilder sb=new StringBuilder();
        while(pq.size()>1)
        {
            char first=pq.remove();
            map.put(first,map.get(first)-1);
            char sec=pq.remove();
            map.put(sec,map.get(sec)-1);

            sb.append(first);
            sb.append(sec);
            if(map.get(first)>0)
            {
                pq.add(first);
            }
            if(map.get(sec)>0)
            {
                pq.add(sec);
            }
        }
        if(!pq.isEmpty())
        {
            char c=pq.remove();
            if(map.get(c)>1)
            {
                return "";
            }
            sb.append(c);

        }
        return sb.toString();
    }
}
