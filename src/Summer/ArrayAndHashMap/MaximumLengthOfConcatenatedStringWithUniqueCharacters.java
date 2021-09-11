package Summer.ArrayAndHashMap;

import java.util.HashSet;
import java.util.List;

public class MaximumLengthOfConcatenatedStringWithUniqueCharacters
{
    private int res=0;
    public int maxLength(List<String> arr)
    {
        if(arr.size()==0) return 0;
        dfs(arr,"",0);
        return res;
    }

    private void dfs(List<String>arr, String pushkar,int idx)
    {
        boolean isUnique=check(pushkar);
        if(isUnique)
        {
            res=Math.max(res,pushkar.length());
        }
        if(idx==arr.size()||!isUnique)
        {
            return;
        }

        for(int i=idx;i<arr.size();i++)
        {
            dfs(arr,pushkar+arr.get(i),i+1);
        }

    }
    private boolean check(String pushkar)
    {
        HashSet<Character> set=new HashSet<>();

        for(char each:pushkar.toCharArray())
        {
            if(!set.contains(each)) {
                set.add(each);
            }else {
                return false;
            }
        }
        return true;

    }
}
