package Summer.tesla;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MaximumLengthOfAConcatenatedStringWithUniqueCharacters
{
    private int res=0;
    public int maxLength(List<String> arr)
    {
        helper(arr,"",0);
        return res;
    }

    public void helper(List<String>arr,String pushkar,int index)
    {
        if(index==arr.size())
        {
            return;
        }

        boolean found=check(pushkar);
        if(found)
        {
            return;

        }
        if(!found)
        {
            res=Math.max(res,pushkar.length());
        }

        for(int i=index;i<arr.size();i++)
        {
            helper(arr,pushkar+arr.get(index),index+1);
        }

    }

    private boolean check(String pushkar)
    {
        HashSet<Character> set=new HashSet<>();
        for(char c:pushkar.toCharArray())
        {
            if(!set.contains(c))
            {
                set.add(c);
                return false;
            }
        }

        return true;
    }
}
