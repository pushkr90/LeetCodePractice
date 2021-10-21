package Summer.google;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
//memoization
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict)
    {

        HashSet<String> set=new HashSet<>(wordDict);
        HashMap<String,Boolean> visited=new HashMap<>();

        return dfs(s,set,visited);

    }

//catsandog---------------------- cat,cats,sand,dog,and
    private boolean dfs(String s, HashSet<String> set,HashMap<String,Boolean> visited)
    {
        if(s=="") return true;
        if(visited.containsKey(s))
        {
            return visited.get(s);
        }

        for(int i=0;i<s.length();i++)
        {
            if(set.contains(s.substring(0,i)) && dfs(s.substring(i,s.length()),set,visited))
            {
                visited.put(s.substring(i,s.length()),true);
                return true;
            }
        }

        visited.put(s,false);
        return false;
    }
}
