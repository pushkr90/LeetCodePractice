package Summer.google;

import Summer.ArrayAndHashMap.Permutations;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class RearrangeCharactersInaStringSoThatNoAdjacentCharacterAreSame {
    public String makeshort(String str)
    {

        if(str.length()==0) return "";
        HashMap<Character,Integer> map=new HashMap<>();

        for(char each:str.toCharArray())
        {

                map.put(each,map.getOrDefault(each,0)+1);

        }
        PriorityQueue<Character> pq=new PriorityQueue<>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return map.get(o1)-map.get(o2);
            }
        });

        pq.addAll(map.keySet());
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty())
        {
            char first=pq.remove();
            map.put(first,map.get(first)-1);
            sb.append(first);
            char second= pq.remove();
            map.put(second, map.get(second)-1);
            sb.append(second);
            if(map.get(first)>0)
            {
                pq.add(first);
            }
            if(map.get(second)>0)
            {
                pq.add(second);
            }
        }

        if(!pq.isEmpty())
        {
            char c=pq.remove();
            if(map.get(c)>1)
            {
                return " " ;
            }
            sb.append(c);

        }
        return sb.toString();
    }
}

/*
* A-3
* B-2
* C-1
*
*
*
* */
