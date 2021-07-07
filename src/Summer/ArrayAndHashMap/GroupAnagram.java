package Summer.ArrayAndHashMap;

import java.util.*;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res =new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();

        for(String each:strs)
        {
            char[] sort=each.toCharArray();
            Arrays.sort(sort);
            String s=new String(sort);
            if(!map.containsKey(sort))
            {
                map.put(sort.toString(),new ArrayList<>());
            }
            List<String> ans=map.get(sort.toString());
            ans.add(each);
            map.put(sort.toString(),ans);
        }
        return  new ArrayList<>(map.values());


    }
}
