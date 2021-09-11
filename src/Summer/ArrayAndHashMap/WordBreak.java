package Summer.ArrayAndHashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class WordBreak
{
    public boolean wordBreak(String s, List<String> wordDict)
    {
        HashSet<String> set=new HashSet<>();
        HashMap<String,Boolean> map=new HashMap<String, Boolean>();
        for(int i=0;i<wordDict.size();i++)
        {
            set.add(wordDict.get(i));
        }
        return dfs(s,set,map);
    }
    public boolean dfs(String s,HashSet<String> set,HashMap<String,Boolean> map)
    {
        if(s.equals("")) return true;
        if(map.containsKey(s))
        {
            return map.get(s);
        }

        for(int i=0;i<=s.length();i++)
        {
            if((set.contains(s.substring(0,i))) && dfs(s.substring(i,s.length()),set,map))
            {
                map.put(s.substring(i,s.length()),true);
                return true;
            }
        }
        map.put(s,false);
        return false;
    }
}
